package exercicioRelampagoPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetonarEstadoAluno() {
        Escolaridade escolaridade = new Escolaridade();
        Estado estado = new Estado();
        Cidade naturalidade = new Cidade(estado);

        Aluno aluno = new Aluno(escolaridade, naturalidade);
        aluno.setNaturalidade(naturalidade);
        aluno.getNaturalidade().getEstado().setNome("Minas Gerais");


        assertEquals("Minas Gerais", aluno.getNomeEstado());
    }

    @Test
    void deveRetonarEstadoEscolaAluno() {

        Escolaridade escolaridade = new Escolaridade();
        Estado estado = new Estado();
        Cidade cidade = new Cidade(estado);
        Aluno aluno = new Aluno(escolaridade, cidade);
        Professor coordenadorDiretor = new Professor(escolaridade, cidade);

        Escola escola = new Escola(coordenadorDiretor,cidade);
        Curso curso = new Curso(coordenadorDiretor,escola);

        aluno.setCurso(curso);
        estado.setNome("Minas Gerais");


        assertEquals("Minas Gerais", aluno.getEstadoEscola());
    }

    @Test
    void deveRetonarCoordenadorCursoAluno() {

        Escolaridade escolaridade = new Escolaridade();
        Estado estado = new Estado();
        Cidade cidade = new Cidade(estado);
        Aluno aluno = new Aluno(escolaridade, cidade);
        Professor coordenadorDiretor = new Professor(escolaridade, cidade);
        coordenadorDiretor.setNome("Maycon");

        Escola escola = new Escola(coordenadorDiretor,cidade);
        Curso curso = new Curso(coordenadorDiretor,escola);

        aluno.setCurso(curso);

        assertEquals("Maycon", aluno.getCoordenadorCursoAluno());
    }


}