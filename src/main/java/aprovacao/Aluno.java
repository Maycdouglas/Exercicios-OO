package aprovacao;

public class Aluno {
    private String nome;
    private String sobrenome;
    private int matricula;

    public void matricular(){
        System.out.println("Aluno Matriculado: " + this.nome);
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
}
