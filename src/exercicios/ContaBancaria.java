package exercicios;

public class ContaBancaria {

    private int numerConta = 0;
    private double saldo;
    private double valorChequeEspecial;
    private double valorUsadoChequeEspecial;
    private boolean estarNoChequeEspecial = false;

    public ContaBancaria (double depositoIncial, int numero){
        this.saldo = depositoIncial;
        this.valorUsadoChequeEspecial = 0;
        this.numerConta = numero;
        
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
            // fiz umas alterações veja se faz sentido agora. calcular os 20%.
            // mas acredito que se ele nao pagar a divida total, o valor restante ele terar que pagar 20%
            // de novo.
           
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
            return true;
            
        } else if ( valor <= saldoTotalDisponivel){
            // aqui precisei fazer algumas alterações para calcular o valor utilizado do cheque especial.
            double valorS = valor - saldo;
            this.saldo = 0;
            this.valorUsadoChequeEspecial += valorS;

            this.estarNoChequeEspecial = true;  
            return true;        
        
        } else {
            return false;
        }

    }

    public double getCheque(){
        return valorChequeEspecial;
    }

    public double getNumer(){
        return numerConta;
    }

    public boolean getUserCheque(){
        return estarNoChequeEspecial;
    }  
   
}
