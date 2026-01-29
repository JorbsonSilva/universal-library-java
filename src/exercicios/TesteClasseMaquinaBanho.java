package exercicios;

import java.util.Scanner;

public class TesteClasseMaquinaBanho {  

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo ao PetShopp - DokiMania.");
        System.out.println("Máquina de banho foi instalada?(sim/não).");
        String instalada = input.next();

        if(instalada.equalsIgnoreCase("sim")){
            var maquinaBanho1 = new MaquinaBanho();

            while (true) {

                System.out.println("Controle de Maquina de Banho do PET.");
                System.out.println("Escolha uma opção abaixo.");
                System.out.println("1 - Dar banho no pet.");
                System.out.println("2 - Abastecer com água.");
                System.out.println("3 - Abastecer com shampoo.");
                System.out.println("4 - Verificar Nivel da água.");
                System.out.println("5 - Verificar Nivel da Shampoo.");
                System.out.println("6 - Verificar se tem pet no banho.");
                System.out.println("7 - Colocar pet na maquina.");
                System.out.println("8 - Retirar pet da máquina.");
                System.out.println("9 - Limpar maquina.");
                System.out.println("0 - Sair.");

                int opcao = input.nextInt();

                if (opcao == 1) {
                    maquinaBanho1.darBanho();
                } else if (opcao == 2){
                    maquinaBanho1.abastecerAgua();
                } else if (opcao == 3){
                    maquinaBanho1.abastecerShampoo();
                } else if (opcao == 4){
                    System.out.println("Nível de água " + maquinaBanho1.getAgua());
                } else if (opcao == 5){
                    System.out.println("Nível de shampoo " + maquinaBanho1.getShampoo());
                } else if (opcao == 6){
                    if (maquinaBanho1.getTemPet() == true){
                        System.out.println("Tem pet na máquina de Banho.");
                    } else {
                        System.out.println("Não tem pet na máquina.");
                    }
                } else if (opcao == 7){
                    maquinaBanho1.colocarPet();
                } else if (opcao == 8){
                    maquinaBanho1.retirarPet();
                } else if (opcao == 9){
                    maquinaBanho1.limparMaquina();
                } else if (opcao == 0){
                    System.out.println("Saindo do sistema....");
                    break;
                }
            }

        } else {
            System.out.println("Solicite a instalação da Máquina");
        }

        input.close();

    }

}
