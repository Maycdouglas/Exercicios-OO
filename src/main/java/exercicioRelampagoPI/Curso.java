package exercicioRelampagoPI;

public class Curso {

    private String nome;
    private Professor coordenador;
    private Escola escola;
    private TipoEnsino tipoEnsino;

    public Curso(Professor coordenador, Escola escola) {
        this.coordenador = coordenador;
        this.escola = escola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public TipoEnsino getTipoEnsino() {
        return tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
    }

    public String getDescricaoEscolaridadeCoordenador() {
        return coordenador.getDescricaoEscolaridade();
    }
}
