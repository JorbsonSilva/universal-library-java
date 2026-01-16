package exercicios;

import java.util.Scanner;

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

    public String getNome(){
        return nome;
    }

    
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numer = 1;

        System.out.println("Caixa eletrônico");
        System.out.println("________________");
        System.out.println("Criar sua conta?(true/false");
        boolean confirmacao = input.nextBoolean();
        if ( confirmacao == true) {
            System.out.println("Digite seu nome:");
            String nom = input.next();
            System.out.println("Quanto você quer depositar?");
            double depos = input.nextDouble();
            numer += 1;
            var conta = new ContaBancaria(depos, numer, nom);
            
        }else { System.out.println("Obrigado!!!");}

        while (confirmacao == true) {
            




            
        }





        input.close();

        
    }
   
}
