package exercicios.HerancaPolimorfismo;

public class IngressoFamilia extends Ingresso{

    private int qtdPessoas;

    public IngressoFamilia (String filmeNome, double valor, boolean dublado, int qtdPessoas){
        super(filmeNome,valor,dublado);
        this.qtdPessoas = qtdPessoas;

    }

    @Override
    public double calcularValorReal(){
        double valortotal = super.calcularValorReal()*this.qtdPessoas;
        if (qtdPessoas > 3) {

            double valorDesconto = valortotal * 0.95;
            return valorDesconto;
        } else {
            return valortotal;
        }

    }
}
