package trabalho1OO;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CervejaTest {

    @Test
    void deveRetornarSemDesconto() {
        Cerveja cerveja = new Cerveja();

        cerveja.setNome("Skol");
        cerveja.setPreco(7.0f);
        cerveja.setQntdCarrinho(15);

        assertEquals(105.0f, cerveja.calcularValorCompra());

    }

    @Test
    void deveRetornarDescontado() {
        Cerveja cerveja = new Cerveja();

        cerveja.setNome("Skol");
        cerveja.setPreco(7.0f);
        cerveja.setQntdCarrinho(16);

        assertEquals(100.8f, cerveja.calcularValorCompra());

    }
}