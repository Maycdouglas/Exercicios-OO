package trabalho1OO;

public class BebidaSemAlcool extends Bebida {

    public int getMaxCarrinho() {
        return 0;
    }

    public float getPercDesconto() {
        return 0;
    }

    public float calcularValorCompra() {
        return (getPreco() * getQntdCarrinho()) - calcularDesconto();
    }

}
