package trabalho1OO;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VinhoTest {

    @Test
    void deveRetornarSemDesconto() {
        Vinho vinho = new Vinho();

        vinho.setNome("Branco");
        vinho.setPreco(40.0f);
        vinho.setQntdCarrinho(10);

        assertEquals(400.0f, vinho.calcularValorCompra());

    }

    @Test
    void deveRetornarDescontado() {
        Vinho vinho = new Vinho();

        vinho.setNome("Branco");
        vinho.setPreco(40.0f);
        vinho.setQntdCarrinho(11);

        assertEquals(374.0f, vinho.calcularValorCompra());

    }
}