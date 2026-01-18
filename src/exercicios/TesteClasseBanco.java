package exercicios;

import java.util.Scanner;

public class TesteClasseBanco {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numer = 1;
        Boolean menu = false;
        String nom = "";
        double depos = 0;
        
        System.out.println("Caixa eletrônico");
        System.out.println("________________");
        System.out.println("Criar sua conta?(sim/não)");
        String confirmacao = input.next();
        if ( confirmacao.equals("sim")) {
            System.out.println("Digite seu nome:");
            nom = input.next();
            System.out.println("Quanto você quer depositar?");
            depos = input.nextDouble();
            numer += 1;              
            menu = true;
            
        }else {             
            System.out.println("Obrigado!!! Volte sempre.");
        }      
        
        while ( menu == true) { 
            var conta = new ContaBancaria(depos, numer, nom);  
            System.out.printf("Bem Vindo, Sr. %s; Numero da conta é %.0f. \n", conta.getNome(), conta.getNumer());
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1 - Consultar saldo;");
            System.out.println("2 - Consultar cheque especial;");
            System.out.println("3 - Depositar dinheiro;");
            System.out.println("4 - Sacar dinheiro;");
            System.out.println("5 - Pagar um boleto;");
            System.out.println("6 - Verificar se a conta está usando cheque especial;");
            System.out.println("7 - Sair.");
            int opcao = input.nextInt();

            if(opcao == 1){
                System.out.printf("Seu saldo é de R$ %.2f.\n", conta.getSaldo());

            } else if(opcao == 2){
                System.out.printf("Seu saldo de cheque especial é de R$ %.2f.\n", conta.getCheque());

            } else if(opcao == 3){
                System.out.println("Quanto voce quer depositar?");
                double deposit = input.nextDouble();
                conta.depositar(deposit);

            } else if(opcao == 4){
                System.out.println("Quanto voce quer sacar?");
                double sac = input.nextDouble();
                conta.sacar(sac);
                
            } else if(opcao == 5){
                System.out.println("Digite o valor do boleto?");
                double boleto = input.nextDouble();
                conta.boleto(boleto);
                
            } else if(opcao == 6){
                if(conta.getUserCheque()== false){
                    System.out.println("Conta não esta utilizando o limite do cheque especial.");
                }else{
                    System.out.printf("Conta esta ultilizando cheque especial, valor utilizado é de R$ %.2f.\n",conta.getValorUsadoCheque());
                }

            } else if(opcao == 7){
                System.out.println("Obrigado por ser nosso cliente.");
                menu = false;
            } else {
                System.out.println("Escolha entre 1 a 7.");
            }
                           
        }

        input.close();
        
    }
    
}
