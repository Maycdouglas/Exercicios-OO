package funcionario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioDiaristaTest {

    @Test
    void calcularSalario() {
        FuncionarioDiarista funcionarioDiarista = new FuncionarioDiarista();
        funcionarioDiarista.setNumDias(10);
        funcionarioDiarista.setValorDia(100);
        funcionarioDiarista.setSalarioFixo(1000);

        assertEquals(2000,funcionarioDiarista.calcularSalario());
    }
}