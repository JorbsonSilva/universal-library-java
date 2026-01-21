package exercicios;

import java.util.Scanner;

public class TesteClasseCarro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        var carro1 = new Carro();

        System.out.println("Painel de controle do Carro.");
        System.out.println(carro1.getEstado());
        System.out.println("Ligar o carro?(sim/não)");
        String estatus = input.next();

        if(estatus.equalsIgnoreCase("sim")){
            carro1.setEstado(true);
        }    
        
        while (carro1.isLigado()) {
            System.out.println("Controle de funcionalidade, digite a opção desejada.");
            System.out.printf("Marcha atual: %d, Velocidade atual: %d km. \n", carro1.getMarcha(), carro1.getVelocidade());
            System.out.println("1 - Almentar a marcha.");
            System.out.println("2 - Diminuir a marcha.");
            System.out.println("3 - Acelerar.");
            System.out.println("4 - Desacelerar.");
            System.out.println("5 - Virar a direita.");
            System.out.println("6 - Virar a esquerda.");
            System.out.println("7 - Desligar.");

            int opcao = input.nextInt();

            if(opcao == 1){
                carro1.subirMarcha();
            } else if (opcao == 2){
                carro1.descMarcha();
            } else if (opcao == 3){
                carro1.acelerar(1);
            } else if (opcao == 4){
                carro1.desacelerar(1);
            } else if(opcao == 5){
                carro1.virar("Direita");
            } else if(opcao == 6){
                carro1.virar("Esquerda");
            } else if(opcao == 7){
                carro1.setEstado(false);
            }
            
        }

        input.close();
    }
    
}
