package exerciciorelampago35;

public class AlunoGraduacao extends Aluno {

    private float nota1,nota2;

    public float getNota1() {
        return this.nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return this.nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    private String situacaoAluno() {
        if((this.nota1 + this.nota2)/2.0f >= 7.0f){
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

    public String infoAluno() {
        return this.getNome() + " - " + this.getMatricula() + " - " + this.situacaoAluno();
    }
}
