package calculadora;

public class Principal {
    public static void main(String[] args) {

        Calculadora calculo1 = new Calculadora();


        System.out.println(calculo1.soma(2,4));
        System.out.println(calculo1.subtracao(2,4));
        System.out.println(calculo1.multiplicacao(2,4));
        System.out.println(calculo1.divisao(2,4));
    }
}
