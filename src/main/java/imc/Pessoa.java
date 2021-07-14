package imc;

public class Pessoa {
    private String sexo;
    private float peso;
    private float altura;

    public String calcularIMC() {

        float imc = getPeso() / (getAltura() * getAltura());

        if (getSexo().equals("Masculino")) {

            if (imc < 20.7f) {
                return "abaixo do peso";
            } else if (imc < 26.4f) {
                return "no peso normal";
            } else if (imc < 27.8f) {
                return "marginalmente acima do peso";
            } else if (imc < 31.1f) {
                return "acima do peso ideal";
            } else{
                return "obeso";
            }

        } else if(getSexo().equals("Feminino")){
            if (imc < 19.1f) {
                return "abaixo do peso";
            } else if (imc < 25.8f) {
                return "no peso normal";
            } else if (imc < 27.3f) {
                return "marginalmente acima do peso";
            } else if (imc < 32.3f) {
                return "acima do peso ideal";
            } else{
                return "obeso";
            }
        }

        return "Sexo inválido! Insira Feminino ou Masculino.";

    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}