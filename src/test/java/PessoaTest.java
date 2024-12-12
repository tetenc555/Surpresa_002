import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PessoaTest {

    @Test
    void naoDeveDefinirSexoInvalido() {
        try{
            Pessoa p = new Pessoa("Feminino",5F,5F);
            p.setSexo("Sereia");
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals(e.getMessage(), "Sexo invalido");
        }
    }

    @Test
    void deveDefinirSexoFeminino() {
        Pessoa p = new Pessoa("Masculino",5F,5F); //  inicializa diferente para ter certeza que ha troca
        p.setSexo("Feminino");
        assertEquals("Feminino",p.getSexo());
    }

    @Test
    void deveDefinirSexoMasculino() {
        Pessoa p = new Pessoa("Feminino",5F,5F); //  inicializa diferente para ter certeza que ha troca
        p.setSexo("Masculino");
        assertEquals("Masculino",p.getSexo());
    }

    @Test
    void naoDeveDefinirPesoZero() {
        try{
            Pessoa p = new Pessoa("Feminino",5F,5F);
            p.setPeso(0F);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals(e.getMessage(), "Peso invalido");
        }
    }

    @Test
    void deveDefinirPesoAcimaDeZero(){
        Pessoa p = new Pessoa("Feminino",5F,5F);
        p.setPeso(1F);
        assertEquals(1F,p.getPeso());
    }

    @Test
    void naoDeveDefinirAlturaZero() {
        try{
            Pessoa p = new Pessoa("Feminino",5F,5F);
            p.setAltura(0F);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals(e.getMessage(), "Altura invalida");
        }
    }

    @Test
    void deveDefinirAlturaAcimaDeZero(){
        Pessoa p = new Pessoa("Feminino",5F,5F);
        p.setAltura(1F);
        assertEquals(1F,p.getAltura());
    }

    //todos os testes estao no limite de condicao
    @Test
    void imcFemininoDeveSerAbaixoPesoMaximo(){ // minimo e o minimo do set
        Pessoa p = new Pessoa("Feminino",20.6F,1F);
        assertEquals("abaixo do peso",p.calcularImc());
    }

    @Test
    void imcFemininoDeveSerPesoNormalMinimo(){
        Pessoa p = new Pessoa("Feminino",20.7F,1F);
        assertEquals("no peso normal",p.calcularImc());
    }

    @Test
    void imcFemininoDeveSerPesoNormalEmMaximo(){
        Pessoa p = new Pessoa("Feminino",26.3F,1F);
        assertEquals("no peso normal",p.calcularImc());
    }

    @Test
    void imcFemininoDeveSerMarginalmenteEmMinimo(){
        Pessoa p = new Pessoa("Feminino",26.4F,1F);
        assertEquals("marginalmente acima do peso ideal",p.calcularImc());
    }

    @Test
    void imcFemininoDeveSerMarginalmenteEmMaximo(){
        Pessoa p = new Pessoa("Feminino",27.7F,1F);
        assertEquals("marginalmente acima do peso ideal",p.calcularImc());
    }

    @Test
    void imcFemininoDeveSerAcimaEmMinimo(){
        Pessoa p = new Pessoa("Feminino",27.8F,1F);
        assertEquals("acima do peso ideal",p.calcularImc());
    }

    @Test
    void imcFemininoDeveSerAcimaEmMaximo(){
        Pessoa p = new Pessoa("Feminino",31.0F,1F);
        assertEquals("acima do peso ideal",p.calcularImc());
    }

    @Test
    void imcFemininoDeveSerObesoEmMinimo(){  //nao existe maximo
        Pessoa p = new Pessoa("Feminino",31.1F,1F);
        assertEquals("obeso",p.calcularImc());
    }

    @Test
    void imcMasculinoDeveSerAbaixoPesoMaximo(){ // minimo e o minimo do set
        Pessoa p = new Pessoa("Masculino",19.0F,1F);
        assertEquals("abaixo do peso",p.calcularImc());
    }

    @Test
    void imcMasculinoDeveSerPesoNormalMinimo(){
        Pessoa p = new Pessoa("Masculino",19.1F,1F);
        assertEquals("no peso normal",p.calcularImc());
    }

    @Test
    void imcMasculinoDeveSerPesoNormalEmMaximo(){
        Pessoa p = new Pessoa("Masculino",25.7F,1F);
        assertEquals("no peso normal",p.calcularImc());
    }

    @Test
    void imcMasculinoDeveSerMarginalmenteEmMinimo(){
        Pessoa p = new Pessoa("Masculino",25.8F,1F);
        assertEquals("marginalmente acima do peso ideal",p.calcularImc());
    }

    @Test
    void imcMasculinoDeveSerMarginalmenteEmMaximo(){
        Pessoa p = new Pessoa("Masculino",27.2F,1F);
        assertEquals("marginalmente acima do peso ideal",p.calcularImc());
    }

    @Test
    void imcMasculinoDeveSerAcimaEmMinimo(){
        Pessoa p = new Pessoa("Masculino",27.3F,1F);
        assertEquals("acima do peso ideal",p.calcularImc());
    }

    @Test
    void imcMasculinoDeveSerAcimaEmMaximo(){
        Pessoa p = new Pessoa("Masculino",32.2F,1F);
        assertEquals("acima do peso ideal",p.calcularImc());
    }

    @Test
    void imcMasculinoDeveSerObesoEmMinimo(){  //nao existe maximo
        Pessoa p = new Pessoa("Masculino",32.3F,1F);
        assertEquals("obeso",p.calcularImc());
    }
}