package exercicios.HerancaPolimorfismo;

public class Vendedor extends Sistema {

    private int qtdVendas;

    public Vendedor(String nome, String email, String senha){
        super(nome, email, senha, false);
        this.qtdVendas = 0;

    };

    public void vendaConcluida(){
        this.qtdVendas++;
    }

    public int getQtdVendas(){
        return this.qtdVendas;
    }
}
