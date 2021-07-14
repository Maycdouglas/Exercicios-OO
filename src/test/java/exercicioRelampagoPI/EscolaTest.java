package exercicioRelampagoPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {
    @Test
    void deveRetonarEscolaridadeDiretor() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setDescricao("Doutorado");
        Estado estado = new Estado();
        Cidade cidade = new Cidade(estado);

        Professor professor = new Professor(escolaridade,cidade);
        professor.setEscolaridade(escolaridade);

        Escola escola = new Escola(professor,cidade);

        assertEquals("Doutorado", escola.getDescricaoEscolaridadeDiretor());
    }
}