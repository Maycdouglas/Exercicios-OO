package funcionario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioHoristaTest {

    @Test
    void calcularSalario() {
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista();
        funcionarioHorista.setNumDias(10);
        funcionarioHorista.setNumHorasDia(10);
        funcionarioHorista.setValorHora(10);
        funcionarioHorista.setSalarioFixo(1000);

        assertEquals(2000,funcionarioHorista.calcularSalario());
    }
}