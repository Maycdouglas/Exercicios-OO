package trabalho1OO;

import java.util.List;

public class Carrinho {

    public static int calcularTotalItens(List<Bebida> bebidas) {
        int totalItens = 0;
        for (Bebida bebida : bebidas) {
            totalItens += bebida.getQntdCarrinho();
        }
        return totalItens;
    }

    public static float calcularValorTotal(List<Bebida> bebidas) {
        float valorTotal = 0.0f;
        for (Bebida bebida : bebidas) {
            valorTotal += bebida.calcularValorCompra();
        }

        return valorTotal;
    }
}
