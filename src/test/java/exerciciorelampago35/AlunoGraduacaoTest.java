package exerciciorelampago35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoGraduacaoTest {

    @Test
    void deveAprovado() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNota1(7.0f);
        aluno.setNota2(7.0f);
        aluno.setMatricula("202065570C");
        aluno.setNome("Maycon");

        assertEquals("Maycon - 202065570C - Aprovado",aluno.infoAluno());
    }

    @Test
    void deveReprovado() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNota1(7.0f);
        aluno.setNota2(6.9f);
        aluno.setMatricula("202065570C");
        aluno.setNome("Maycon");

        assertEquals("Maycon - 202065570C - Reprovado",aluno.infoAluno());

    }
}