import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatoria\t--");

        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Grant, Adam", new Livro("Pense de Novo", 318));
            put("Duhigg, Charles", new Livro("O poder do Habito", 408));
            put("Hill, Napoleon", new Livro("Quem Pensa Enriquece", 680));
        }};
        for(Map.Entry<String, Livro> livro : meusLivros.entrySet())
        System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem de Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put("Grant, Adam", new Livro("Pense de Novo", 318));
            put("Duhigg, Charles", new Livro("O poder do Habito", 408));
            put("Hill, Napoleon", new Livro("Quem Pensa Enriquece", 680));
        }};
        for(Map.Entry<String, Livro> livro1 : meusLivros1.entrySet())
            System.out.println(livro1.getKey() + " - " + livro1.getValue().getNome());

        System.out.println("--\tOrdem alfabetica dos autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfabetica dos livros\t--");

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>( new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

//        System.out.println("--\tOrdem numero de paginas\t--");
    }
}

class Livro {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    private String nome;
    private Integer paginas;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;



    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}