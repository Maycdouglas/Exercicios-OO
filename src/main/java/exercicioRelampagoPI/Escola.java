package exercicioRelampagoPI;

public class Escola {

    private String nome;
    private Professor diretor;
    private Cidade cidade;

    public Escola(Professor diretor, Cidade cidade) {
        this.cidade = cidade;
        this.diretor = diretor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getDiretor() {
        return diretor;
    }

    public void setDiretor(Professor diretor) {
        this.diretor = diretor;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getDescricaoEscolaridadeDiretor() {
        return diretor.getDescricaoEscolaridade();
    }

}
