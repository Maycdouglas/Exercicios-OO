package builder;

public class Principal {
    public static void main(String[] args) {

        Funcionario funcioario1 = new Funcionario();
        funcioario1.setNome("Maycon");
        funcioario1.setSalarioBruto(10000);
        funcioario1.setTotalAcrescimos(5000);
        funcioario1.setTotalDescontos(1000);

        System.out.println(funcioario1.getNome());
        System.out.println(funcioario1.salarioLiquido());

    }
}
