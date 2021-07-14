package exerciciorelampago35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveNomeTitulo() {
        Professor prof = new Professor();
        prof.setNome("Maycon");
        prof.setTitulacaoMaxima("Mestre");

        assertEquals("Maycon - Mestre", prof.nomeTitulacao());
    }
}