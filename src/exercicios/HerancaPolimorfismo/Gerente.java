package exercicios.HerancaPolimorfismo;

public class Gerente extends Sistema{

    public Gerente(String nome, String email, String senha){
        super(nome, email, senha, true);
    };

    public void consultarVendas(Vendedor vend){
        System.out.println("Relatorio de vendas do vendedor " + vend.getNome()+".");
        System.out.printf("Foi realizado " + vend.getQtdVendas() + " vendas hoje.\n" );
        System.out.println("____________________________________");
    }

    public void relatorioFinanceiro(Atendente atend){
        System.out.println("Relatorio financeiro do atendente " + atend.getNome()+".");
        System.out.printf("Valor recebido ate o momento foi de R$ " + atend.getValorCaixa() + ".\n");
        System.out.println("____________________________________");
    }
    
}
