package exercicios.Dominando_Interfaces_Lambda;

import java.util.Scanner;

public class TesteTributos {
/* Escreva um código que calcule o valor de tributos de produtos, os produtos disponíveis
 devem ser dos seguintes tipos: Alimentação, Saude e bem estar, Vestuário e Cultura. 
 Todos os produtos devem ter um método para retornar o seu valor de imposto, de acordo com seu tipo:

Alimentação 1%;
Saude e bem estar 1.5%;
Vestuário 2.5%;
Cultura 4%. */

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Tributos alimentacao = (preco) -> preco * 0.01;
        Tributos saudeBemEstar = (preco) -> preco * 0.015;
        Tributos vestuario = (preco) -> preco * 0.025;
        Tributos cultura = (preco) -> preco * 0.04;
            
        System.out.println("Caixa");
        System.out.println("Escolha o tipo do produto:");
        System.out.println("1-Alimentação;");
        System.out.println("2-Saude e bem estar;");
        System.out.println("3-vestuário;");
        System.out.println("4-Cultura.");
        System.out.println("5-Encerra.");
        System.out.print("Opcão: ");
        int opcao = input.nextInt();
        
            if (opcao != 5) {

                if (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4 ){

                System.out.println("Valor do produto?");
                double valor = input.nextDouble();

                    switch (opcao) {
                        case 1:
                            System.out.println("Valor que deverar ser pago de imposto é R$ " + alimentacao.imposto(valor));
                            break;
                        case 2:
                            System.out.println("Valor que deverar ser pago de imposto é R$ " + saudeBemEstar.imposto(valor));
                            break;
                        case 3:
                            System.out.println("Valor que deverar ser pago de imposto é R$ " + vestuario.imposto(valor));
                            break;
                        case 4:
                            System.out.println("Valor que deverar ser pago de imposto é R$ " + cultura.imposto(valor));
                            break;
                    }   
                } else {
                    System.out.println("Escolha uma opção valida.");  
                }
            } else {
                System.out.println("Saindo do caixa.....");
            }
        input.close();
    }
}

