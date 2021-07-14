package imc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveAbaixoPesoM() {
        Pessoa pessoa=new Pessoa();
        pessoa.setPeso(20.6f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("Masculino");
        assertEquals("abaixo do peso",pessoa.calcularIMC());
    }


    @Test
    void devePesoNormalM() {
        Pessoa pessoa=new Pessoa();
        pessoa.setPeso(26.3f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("Masculino");
        assertEquals("no peso normal",pessoa.calcularIMC());
    }

    @Test
    void devePesoMargAcimaM() {
        Pessoa pessoa=new Pessoa();
        pessoa.setPeso(27.7f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("Masculino");
        assertEquals("marginalmente acima do peso",pessoa.calcularIMC());
    }

    @Test
    void devePesoAcimaIdealM() {
        Pessoa pessoa=new Pessoa();
        pessoa.setPeso(31.0f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("Masculino");
        assertEquals("acima do peso ideal",pessoa.calcularIMC());
    }

    @Test
    void deveObesoM() {
        Pessoa pessoa=new Pessoa();
        pessoa.setPeso(31.1f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("Masculino");
        assertEquals("obeso",pessoa.calcularIMC());
    }

    @Test
    void deveAbaixoPesoF() {
        Pessoa pessoa=new Pessoa();
        pessoa.setPeso(19.0f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("Feminino");
        assertEquals("abaixo do peso",pessoa.calcularIMC());
    }

    @Test
    void devePesoNormalMinF() {
        Pessoa pessoa=new Pessoa();
        pessoa.setPeso(25.7f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("Feminino");
        assertEquals("no peso normal",pessoa.calcularIMC());
    }

    @Test
    void devePesoMargAcimaMinF() {
        Pessoa pessoa=new Pessoa();
        pessoa.setPeso(27.2f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("Feminino");
        assertEquals("marginalmente acima do peso",pessoa.calcularIMC());
    }

    @Test
    void devePesoAcimaIdealMinF() {
        Pessoa pessoa=new Pessoa();
        pessoa.setPeso(32.2f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("Feminino");
        assertEquals("acima do peso ideal",pessoa.calcularIMC());
    }

    @Test
    void deveObesoF() {
        Pessoa pessoa=new Pessoa();
        pessoa.setPeso(32.3f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("Feminino");
        assertEquals("obeso",pessoa.calcularIMC());
    }
}