package exercicios.HerancaPolimorfismo;

public class MeiaEntrada extends Ingresso{

    public MeiaEntrada(String filmeNome, double valor, boolean dublado){
        super(filmeNome,valor,dublado);
    }
    
    @Override
    public double calcularValorReal(){
        return super.calcularValorReal()/2;
    }
    
}
