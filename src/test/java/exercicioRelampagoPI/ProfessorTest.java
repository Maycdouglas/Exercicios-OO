package exercicioRelampagoPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetonarEscolaridadeProfessor() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setDescricao("Mestrado");
        Estado estado = new Estado();
        Cidade cidade = new Cidade(estado);

        Professor professor = new Professor(escolaridade,cidade);

        assertEquals("Mestrado", professor.getDescricaoEscolaridade());
    }

    @Test
    void deveRetonarCidadeProfessor() {
        Escolaridade escolaridade = new Escolaridade();
        Estado estado = new Estado();
        Cidade cidade = new Cidade(estado);

        Professor professor = new Professor(escolaridade,cidade);
        cidade.setNome("Araponga");
        professor.setNaturalidade(cidade);


        assertEquals("Araponga", professor.getNomeCidade());
    }

    @Test
    void deveRetonarTipoEnsinoProfessor() {
        Escolaridade escolaridade = new Escolaridade();
        Estado estado = new Estado();
        Cidade cidade = new Cidade(estado);

        Professor professor = new Professor(escolaridade,cidade);
        Escola escola = new Escola(professor,cidade);

        Curso curso = new Curso(professor,escola);
        professor.setCurso(curso);
        TipoEnsino tipoEnsino = new TipoEnsino();
        curso.setTipoEnsino(tipoEnsino);

        curso.getTipoEnsino().setNome("Ensino Fundamental");


        assertEquals("Ensino Fundamental", professor.getTipoEnsinoProfessor());
    }

    @Test
    void deveRetonarDiretorEscolaProfessor() {
        Escolaridade escolaridade = new Escolaridade();
        Estado estado = new Estado();
        Cidade cidade = new Cidade(estado);

        Professor professor = new Professor(escolaridade,cidade);
        Escola escola = new Escola(professor,cidade);

        Curso curso = new Curso(professor,escola);
        professor.setCurso(curso);

        escola.getDiretor().setNome("Maycon");


        assertEquals("Maycon", professor.getDiretorEscolaProfessor());
    }

    @Test
    void deveRetonarCoordenadorCursoProfessor() {
        Escolaridade escolaridade = new Escolaridade();
        Estado estado = new Estado();
        Cidade cidade = new Cidade(estado);

        Professor professor = new Professor(escolaridade,cidade);
        Escola escola = new Escola(professor,cidade);

        Curso curso = new Curso(professor,escola);
        professor.setCurso(curso);

        curso.getCoordenador().setNome("Maycon");


        assertEquals("Maycon", professor.getCoordenadorCursoProfessor());
    }
}