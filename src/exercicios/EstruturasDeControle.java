package exercicios;

import java.util.Scanner;


public class EstruturasDeControle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Exercício 1 //
// Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número; //
        System.out.println("Digite o número para a criação da tabuada:");
        int numero = input.nextInt();

        for(int i=1; i<=10; i++){
            System.out.printf("%d x %d = %d \n",numero, i,(numero * i));
        }

        // Exercício 2 //
/* Escreva um código onde o usuário entra com sua altura e peso, 
seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja 
exibida a mensagem de acordo com o resultado:

Se for menor ou igual a 18,5 "Abaixo do peso";
se for entre 18,6 e 24,9 "Peso ideal";
Se for entre 25,0 e 29,9 "Levemente acima do peso";
Se for entre 30,0 e 34,9 "Obesidade Grau I";
Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
Se for maior ou igual a 40,0 "Obesidade III (Mórbida)"; */

        System.out.println("Calculo do seu IMC");
        System.out.println("Digite sua altura:");
        double altura = input.nextDouble();
        if (altura > 0){
            System.out.println("Digite seu peso:");
            double peso = input.nextDouble();

            double imc = peso/(altura * altura);

            if (imc <= 18.5){
                System.out.println("Você está abaixo do peso!!");
            } else if(imc <= 24.9){
                System.out.println("Você esta no peso ideal.");
            } else if(imc <= 29.9){
                System.out.println("Você esta levemente acima do peso.");
            } else if(imc <= 34.9){
                System.out.println("Você esta com obesidade grau I.");
            } else if(imc <= 39.9){
                System.out.println("Você esta com obesidade grau II(Severo).");
            } else {
                System.out.println("Você esta com obesidade grau III(Mórbida).");
            } 
        }else{
            System.out.println("Sua altura não pode ser menor ou igual a 0. ");
        }

        // Exercício 3 //
/* Escreva um código que o usuário entre com um primeiro número, um segundo 
número maior que o primeiro e escolhe entre a opção par e impar, com isso o 
código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial)
no intervalo de números informados, incluindo os números informados e em ordem decrescente; */


        System.out.println("Digite o primeiro número:");
        int n1 = input.nextInt();
        System.out.println("Digite o segundo número (maior que o primeiro):");
        int n2 = input.nextInt();
        if (n2 > n1){
            System.out.println("Você que ímpar ou par?");
            String opcao = input.next();

            boolean opcaovalida = false;
            int resto = 0;

            if(opcao.equalsIgnoreCase("par")){
                resto = 0;
                opcaovalida = true;
            } else if(opcao.equalsIgnoreCase("impar")) {
                resto = 1;
                opcaovalida = true;
            }
            
            if (opcaovalida){
                System.out.println("Resultado decrescente");

                for(int i=n2; i>=n1; i--){ 
                    
                    if ( i % 2 !=0 && resto == 1){
                        System.out.println(i);                     
                    } else if(i % 0 ==0 && resto == 0){
                        System.out.println(i);
                    }                 
                }

            }else{
                System.out.println("Você digitou dados invalidos, escolha entre Impa/par.");
            }
        } else {
            System.out.println("Você deve escolher um número maior do que o primeiro.");
        }

    // Exercício 4//
/* Escreva um código onde o usuário informa um número inicial, 
posteriormente irá informar outros N números, a execução do código irá 
continuar até que o número informado dividido pelo primeiro número tenha 
resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados
 */ 
        System.out.println("Escolha um número:");
        int numer1 = input.nextInt();

        boolean teste = true;
       
        int result = 0;
        int numer2 = 0;       

        while (teste) {
            System.out.println("Agora escolha o segundo número:");
            numer2 = input.nextInt();
            if (numer2 >= numer1) {
                result = numer2 % numer1;   
                if(result != 0){
                    double resultFinal = numer2/numer1; 
                    System.out.printf("Você escolheu o numero %s dividido por %s, resultado %s. ",numer2, numer1, resultFinal);
                    teste = false;
                }else{System.out.print("Tente de novo.\n");}             
                
            }
            
        }      
            
    input.close();

    }
    
}
