package exerciciorelampago35;

public class Professor extends Pessoa {

    private String titulacaoMaxima;

    public String getTitulacaoMaxima() {
        return this.titulacaoMaxima;
    }

    public void setTitulacaoMaxima(String titulacaoMaxima) {
        this.titulacaoMaxima = titulacaoMaxima;
    }

    public String nomeTitulacao() {
        return this.getNome() + " - " + this.getTitulacaoMaxima();
    }
}
