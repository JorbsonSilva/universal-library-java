package exercicios.HerancaPolimorfismo;

public class Ingresso {


    private String filmeNome;
    private double valor;
    private Boolean dublado;

    public Ingresso(String filmeNome, double valor, boolean dublado){
        this.filmeNome = filmeNome;
        this.valor = valor;
        this.dublado = dublado;
    }

    public String getFilmeNome(){
        return filmeNome;
    }

    public Boolean getDublado(){
        return dublado;
    }

    public void setLinguagem(Boolean dublado){
        this.dublado = dublado;
    }

    public double calcularValorReal(){
        return this.valor;
    }
}