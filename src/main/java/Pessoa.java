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

    public String calcularImc(){
        float imc = (this.getPeso()/(this.getAltura()*this.getAltura()));
        if(this.getSexo().equals("Feminino")){
            if(imc<20.7F)
                return "abaixo do peso";
            else if (imc<26.4F) // usamos else if pois o valor da condicao anterior estara englobado nesse
                return "no peso normal";
            else if (imc<27.8F)
                return "marginalmente acima do peso ideal";
            else if (imc<31.1)
                return "acima do peso ideal";
            else
                return "obeso";
        }
        else{
            if(imc<19.1F)
                return "abaixo do peso";
            else if (imc<25.8F)
                return "no peso normal";
            else if (imc<27.3F)
                return "marginalmente acima do peso ideal";
            else if (imc<32.3F)
                return "acima do peso ideal";
            else
                return "obeso";
        }
    }
}
