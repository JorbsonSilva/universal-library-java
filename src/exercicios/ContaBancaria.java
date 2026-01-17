package exercicios;

public class ContaBancaria {

    private int numerConta = 0;
    private String nome;
    private double saldo;
    private double valorChequeEspecial;
    private double valorUsadoChequeEspecial;
    private boolean estarNoChequeEspecial = false;

    public ContaBancaria (double depositoIncial, int numero, String nome){
        this.saldo = depositoIncial;
        this.valorUsadoChequeEspecial = 0;
        this.numerConta = numero;
        this.nome = nome;
        
        if (depositoIncial<=500){
            this.valorChequeEspecial = 50;

        } else{
            this.valorChequeEspecial = depositoIncial * 0.5;
        }
        
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if ( estarNoChequeEspecial == false){
            this.saldo += valor;

        } else {                       
            double taxa = this.valorUsadoChequeEspecial*0.20;
            double divida = this.valorUsadoChequeEspecial + taxa;

            if (valor < divida){
                double valorLiquido = valor - taxa;
                    if(valorLiquido > 0){
                        this.valorUsadoChequeEspecial -= valorLiquido;
                    }       

            } else if(valor>divida){
                double valorCorrigido = valor - divida;
                this.saldo += valorCorrigido;
                this.valorUsadoChequeEspecial = 0;
                this.estarNoChequeEspecial = false;

            } else {
                this.valorUsadoChequeEspecial = 0;
                this.estarNoChequeEspecial = false;
            }            
        }               
    }

    public boolean sacar(double valor){ 
        double saldoTotalDisponivel = this.saldo + this.valorChequeEspecial;

        if (valor <= saldo){
            this.saldo -= valor;
            System.out.print("Retire o dinheiro.");

            return true;
            
        } else if ( valor <= saldoTotalDisponivel){
            // aqui precisei fazer algumas alterações para calcular o valor utilizado do cheque especial.
            double valorS = valor - saldo;
            this.saldo = 0;
            this.valorUsadoChequeEspecial += valorS;
            this.estarNoChequeEspecial = true;
            System.out.println("\n  ALERTA: Você entrou no Cheque Especial! ");
            System.out.println("Taxa de 20% será cobrada no próximo depósito.");
            System.out.println("Retire o dinheiro.");  
            return true;        
        
        } else {
            System.out.println("Valor insuficiente para realizar o saque.");
            return false;
        }
    }

    public boolean boleto(double valor){ 
        boolean conseguiuPagar = sacar(valor); 
        
        if (conseguiuPagar) {
            System.out.println("Boleto pago com sucesso! Comprovante impresso.");
            return true;
        } else {
            System.out.println("Erro ao pagar boleto: Saldo insuficiente.");
            return false;
        }
    }

    public double getCheque(){
        return valorChequeEspecial;
    }

    public double getValorUsadoCheque(){
        return valorUsadoChequeEspecial;
    }

    public double getNumer(){
        return numerConta;
    }

    public boolean getUserCheque(){
        return estarNoChequeEspecial;
    }

    public String getNome(){
        return nome;
    }

      
}

