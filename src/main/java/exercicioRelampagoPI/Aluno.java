package exercicioRelampagoPI;

public class Aluno extends Pessoa {

    private Curso curso;

    public Aluno(Escolaridade escolaridade, Cidade naturalidade) {
        super(escolaridade, naturalidade);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getEstadoEscola(){
        return curso.getEscola().getCidade().getEstado().getNome();
    }

    public String getCoordenadorCursoAluno() {
        return curso.getCoordenador().getNome();
    }

}
