package exercicios;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class ListaFundamentos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Exercício 1 //

        System.out.println("Cadastro");
        System.out.println("Digite seu nome:");
        String name = input.nextLine();
        System.out.println("Digite seu ano de nascimento:");
        int birth = input.nextInt();

        int yearCurrent = OffsetDateTime.now().getYear();
        int age = yearCurrent - birth;

        System.out.printf("Olá %s você tem %s anos!",name,age);

        // Exercício 2 //

        System.out.println("Calculo de área do quadrado");
        System.out.println("Digite o valor de um lado do quadrado:");
        double value = input.nextDouble();

        double area = value * value;

        System.out.printf("Área do quadrado é %s m².", area);   
        
        // Exercício 3 //

        System.out.println("Calculo de área do retangulo");
        System.out.println("Digite o valor da base do retangulo:");
        double base = input.nextDouble();
        System.out.println("Digite o valor da altura do retangulo:");
        double height = input.nextDouble();

        double area1 = base * height;

        System.out.printf("Área do retangulo é %s m².", area1);

        // Exercício 4 //

        System.out.println("Cadastro");
        System.out.println("Digite o nome da 1° pessoa:");
        String name1 = input.nextLine();
        System.out.println("Digite a idade da 1° pessoa:");
        int age1 = input.nextInt();
        System.out.println("Digite o nome da 2° pessoa:");
        String name2 = input.nextLine();
        System.out.println("Digite a idade da 2° pessoa:");
        int age2 = input.nextInt();
        
        int differenceAge = age1 - age2;

        System.out.printf("Olá, a diferença de idade de vocês é %s !", differenceAge);

        input.close();

    }
    
}
