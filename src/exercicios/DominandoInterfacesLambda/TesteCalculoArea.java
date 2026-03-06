package exercicios.DominandoInterfacesLambda;

import java.util.Scanner;

public class TesteCalculoArea {
/* Escreva um código onde seja possível calcular a área de uma figura geométrica,
 todas devem ter um método que retorne esse valor, as formas geométricas disponiveis devem ser as seguintes:

Quadrado: possui o valor dos seus lados;
Retângulo: possui os valores de base e altura;
Circulor: possui o atributo raio. */
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        CalculoDeArea quadrado = (valor, valor1) -> valor * valor1; 
        CalculoDeArea retangulo = (valor, valor1) -> valor * valor1;
        CalculoDeArea circulo = (valor, valor1) -> valor * (valor1*valor1); 
     
        System.out.println("Calculadora de Área.");
        System.out.println("Escolha o tipo de uma figura geométrica:");
        System.out.println("1-quadrado;");
        System.out.println("2-retangulo;");
        System.out.println("3-circulo;");
        System.out.println("4-Encerra.");
        System.out.print("Opcão: ");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor de um dos lados:");
                double lado = input.nextDouble();
                System.out.println("Valor da área é de " + quadrado.area(lado,lado));
                break;

            case 2:
                System.out.println("Digite o valor da base:");
                double base = input.nextDouble();
                System.out.println("Digite o valor da altura:");
                double altura = input.nextDouble();
                System.out.println("Valor da área é de " + retangulo.area(base,altura));
                break;

            case 3:
                System.out.println("Digite o valor do raio:");
                double raio = input.nextDouble();
                System.out.println("Valor da área é de " + circulo.area(Math.PI,raio));
                break;

            case 4:
                System.out.println("Saindo da calculadora....");
                break;
        
            default:
                System.out.println("Escolha uma opção valida.");
                break;
            }

        input.close();
        
    }
}
