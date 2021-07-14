package exercicioRelampagoPI;

public class Professor extends Pessoa {

    private Curso curso;

    public Professor(Escolaridade escolaridade, Cidade naturalidade) {
        super(escolaridade,naturalidade);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getTipoEnsinoProfessor(){
        return curso.getTipoEnsino().getNome();
    }

    public String getDiretorEscolaProfessor(){
        return curso.getEscola().getDiretor().getNome();
    }

    public String getCoordenadorCursoProfessor(){
        return curso.getCoordenador().getNome();
    }
}
