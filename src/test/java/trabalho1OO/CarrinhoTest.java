package trabalho1OO;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

class CarrinhoTest {

    @Test
    void deveRetornar20Itens() {

        Bebida bebida1 = new BebidaSemAlcool();
        bebida1.setQntdCarrinho(5);

        Cerveja bebida2 = new Cerveja();
        bebida2.setQntdCarrinho(10);

        Vinho bebida3 = new Vinho();
        bebida3.setQntdCarrinho(5);

        List<Bebida> lista = new ArrayList<Bebida>();
        lista.add(bebida1);
        lista.add(bebida2);
        lista.add(bebida3);

        assertEquals(20, Carrinho.calcularTotalItens(lista));
    }

    @Test
    void calcularValorTotal() {

        Bebida bebida1 = new BebidaSemAlcool();
        bebida1.setQntdCarrinho(5);
        bebida1.setPreco(5.0f);

        Cerveja bebida2 = new Cerveja();
        bebida2.setQntdCarrinho(10);
        bebida2.setPreco(5.0f);

        Vinho bebida3 = new Vinho();
        bebida3.setQntdCarrinho(5);
        bebida3.setPreco(5.0f);

        List<Bebida> lista = new ArrayList<Bebida>();
        lista.add(bebida1);
        lista.add(bebida2);
        lista.add(bebida3);

        assertEquals(100, Carrinho.calcularValorTotal(lista));

    }
}