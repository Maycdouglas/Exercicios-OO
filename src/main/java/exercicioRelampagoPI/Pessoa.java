package exercicioRelampagoPI;

public class Pessoa {

    private Escolaridade escolaridade;
    private Cidade naturalidade;
    private String nome;

    public Pessoa(Escolaridade escolaridade, Cidade naturalidade) {
        this.escolaridade = escolaridade;
        this.naturalidade = naturalidade;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Cidade getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(Cidade naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getDescricaoEscolaridade() {
        return escolaridade.getDescricao();
    }

    public String getNomeCidade() {
        return naturalidade.getNome();
    }

    public String getNomeEstado() {
        return naturalidade.getEstado().getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
