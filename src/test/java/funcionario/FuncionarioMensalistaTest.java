package funcionario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioMensalistaTest {

    @Test
    void calcularSalario() {
        FuncionarioMensalista funcionarioMensalista = new FuncionarioMensalista();
        funcionarioMensalista.setValorMes(1000.0f);
        funcionarioMensalista.calcularSalario();
        funcionarioMensalista.setSalarioFixo(1000);

        assertEquals(2000,funcionarioMensalista.calcularSalario());
    }
}