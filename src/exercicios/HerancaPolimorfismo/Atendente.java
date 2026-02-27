package exercicios.HerancaPolimorfismo;

public class Atendente extends Sistema{

    private double valorCaixa;

    public Atendente(String nome, String email, String senha){
        super(nome, email, senha, false);
        this.valorCaixa = 0.0;
    };

    public void receberPagamento(Double valor){
        this.valorCaixa += valor;
    }

    public double getValorCaixa(){
        return this.valorCaixa;
    }

    public void fecharCaixa(){
        System.out.println("Valor final de vendas do dia foi de R$ " + this.valorCaixa + ".");
        this.valorCaixa = 0.0;
    }
    

}
