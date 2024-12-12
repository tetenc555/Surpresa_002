public class Pessoa {
    private String sexo;
    private float peso;
    private float altura;

    public Pessoa(String sexo, float peso, float altura) {
        this.setSexo(sexo);
        this.setPeso(peso);
        this.setAltura(altura);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if(!(sexo.equals("Masculino") || sexo.equals("Feminino"))) {
            throw new IllegalArgumentException("Sexo invalido");
        }
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if (peso<=0)
            throw new IllegalArgumentException("Peso invalido");
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura<=0)
            throw new IllegalArgumentException("Altura invalida");
        this.altura = altura;
    }
}
