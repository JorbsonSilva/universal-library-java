package exercicios.HerancaPolimorfismo;

import java.util.Scanner;

public class TesteRelogio {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

    System.out.println("Que horas são?");
    int horas = input.nextInt();
    System.out.println("E os minutos?");
    int minuto = input.nextInt();
    System.out.println("E os segundos aproximados?");
    int segundo = input.nextInt();

    RelogioBrasileiro relogio = new RelogioBrasileiro(horas,minuto,segundo);
    RelogioAmericano relogio1 = new RelogioAmericano(0, 0, 0,"AM");

    System.out.println("--- ANTES DA SINCRONIZAÇÃO ---");    
    System.out.println("Horas no Brasil: " + relogio.getHoraFormatada());
    System.out.println("Horas no EUA: " + relogio1.getHoraFormatada());
    
    System.out.println("--- TESTE DE SINCRONIZAÇÃO ---");
    relogio1.sincronizar(relogio);
    System.out.println("--- DEPOIS DA SINCRONIZAÇÃO ---");    
    System.out.println("Horas no Brasil: " + relogio.getHoraFormatada());
    System.out.println("Horas no EUA: " + relogio1.getHoraFormatada());

    relogio.setHora(0);
    relogio.setMinuto(0);
    relogio.setSegundo(0);
    relogio1.setHora(horas);
    relogio1.setMinuto(minuto);
    relogio1.setSegundo(segundo);

    System.out.println("Invertendo os relogios.");

    System.out.println("--- ANTES DA SINCRONIZAÇÃO ---");    
    System.out.println("Horas no Brasil: " + relogio.getHoraFormatada());
    System.out.println("Horas no EUA: " + relogio1.getHoraFormatada());
    
    System.out.println("--- TESTE DE SINCRONIZAÇÃO ---");
    relogio.sincronizar(relogio1);
    System.out.println("--- DEPOIS DA SINCRONIZAÇÃO ---");    
    System.out.println("Horas no Brasil: " + relogio.getHoraFormatada());
    System.out.println("Horas no EUA: " + relogio1.getHoraFormatada());

    input.close();
    }
    
}
