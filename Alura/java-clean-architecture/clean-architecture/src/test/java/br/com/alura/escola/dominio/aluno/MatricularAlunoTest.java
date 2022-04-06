package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.aluno.matricular.MatricularAluno;
import br.com.alura.escola.dominio.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);

        MatricularAlunoDto dados = new MatricularAlunoDto(
                "William Almeida",
                "123.456.789-00",
                "william@gmail.com");
        useCase.executa(dados);

        Aluno encontrado = repositorio.buscarPorCPF(new CPF("123.456.789-00"));

        assertEquals("William Almeida", encontrado.getNome());
        assertEquals("123.456.789-00", encontrado.getCpf());
        assertEquals("william@gmail.com", encontrado.getEmail());

    }
}
