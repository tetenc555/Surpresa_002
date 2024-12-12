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
}