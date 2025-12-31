package exercicios;

import java.util.Scanner;

/* O Desafio: "Calculadora de Maratona"

    O que o código deve fazer:

    Perguntar o nome de uma Série ou Matéria.
    Perguntar quantos minutos tem cada episódio (ou cada aula).
    Perguntar quantos episódios/aulas faltam.
    Calcular o tempo total em minutos e imprimir na tela. */

public class Desafios {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Escreva o nome do conteudo que você esta acompanhando:");
        String name = input.nextLine();
        System.out.println("Quantos minutos tem cada episódio?");
        int time = input.nextInt();
        System.out.println("Quantos episódio faltam?");
        int episodio = input.nextInt();

        int total = time * episodio;

        System.out.printf("Vai ser necessario %d minutos para você finalizar %s.", total,name);

        input.close();
    }
    
}
