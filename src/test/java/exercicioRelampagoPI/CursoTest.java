package exercicioRelampagoPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetonarEscolaridadeCoordenador() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setDescricao("Doutorado");
        Estado estado = new Estado();
        Cidade cidade = new Cidade(estado);


        Professor coordenadorDiretor = new Professor(escolaridade,cidade);
        coordenadorDiretor.setEscolaridade(escolaridade);
        Escola escola = new Escola(coordenadorDiretor,cidade);

        Curso curso = new Curso(coordenadorDiretor,escola);

        assertEquals("Doutorado", curso.getDescricaoEscolaridadeCoordenador());
    }

}