package exerciciorelampago35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoEnsinoMedioTest {

    @Test
    void deveAprovado() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNota1(6.0f);
        aluno.setNota2(6.0f);
        aluno.setMatricula("202065570C");
        aluno.setNome("Maycon");

        assertEquals("Maycon - 202065570C - Aprovado",aluno.infoAluno());
    }

    @Test
    void deveReprovado() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNota1(6.0f);
        aluno.setNota2(5.9f);
        aluno.setMatricula("202065570C");
        aluno.setNome("Maycon");

        assertEquals("Maycon - 202065570C - Reprovado",aluno.infoAluno());

    }
}