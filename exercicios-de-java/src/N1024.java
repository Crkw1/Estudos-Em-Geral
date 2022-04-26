import java.util.Scanner;

public class N1024 {

    public static void main(String[] args) {
        // Instanciando o leitor e lendo o número de caso de testes
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // Percorendo os N Casos de teste
        for (int i = 0; i < N; i++) {

            // Iniciando o StringBuilder para trabalhar a String
            StringBuilder M = new StringBuilder(readLine(scanner));

            // 1
            for (int j = 0; j < M.length(); j++) {
                int code = M.charAt(j);
                if ((code >= 65 && code <= 90) || (code >= 97 && code <= 122)) {
                    char c = (char) (code + 3);
                    M.setCharAt(j, c);
                }
            }

            // 2
            M.reverse();

            // 3
            for (int j = M.length() / 2; j < M.length(); j++) {
                char c = (char) (M.charAt(j) - 1);
                M.setCharAt(j, c);
            }

            // Print
            System.out.println(M.toString());
        }
    }


    // * Método para ler a String sem bugs de espaçamentos

    public static String readLine(Scanner leitor) {
        String line = leitor.nextLine();
        while (line.isEmpty())
            line = leitor.nextLine();
        return line;
    }

}