package exercicios.DominandoInterfacesLambda;

import java.util.Scanner;

public class TesteEnvioMensagem {

    /* Escreva um código para enviar mensagens de marketing, para isso você deve ter
 a possibilidade de enviar a mesma mensagem para serviços diferentes, esses serviços
  devem ter um método para receber a mensagem como parâmetro, os serviços que devem estar disponíveis são:

SMS;
E-mail;
Redes Sociais;
WhatsApp; */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Menu de Envio de mensagem");
        System.out.println("Digite a mensagem a ser enviada.");
        String mensagem = input.nextLine();
        System.out.println("1-Enviar via SMS;");
        System.out.println("2-Enviar via e-mail;");
        System.out.println("3-Enviar via Rede Social;");
        System.out.println("4-Enviar via Whatsapp.");
        System.out.println("5-Encerra.");
        System.out.println("Escolha uma opção!!!!!!");
        int opcao = input.nextInt();

        EnviarMensagem sms = (texto) -> "Enviando pelo SMS: " + texto;
        EnviarMensagem eMail = (texto) -> "Enviando pelo E-mail: " + texto ;
        EnviarMensagem redeSocial = (texto) -> "Enviando pela Rede Social: " + texto ;
        EnviarMensagem whatsapp = (texto) -> "Enviando pelo Whatsapp: " + texto ;
            
        if (opcao == 1){
            System.out.println(sms.enviar(mensagem));
        } else if ( opcao == 2 ){
            System.out.println(eMail.enviar(mensagem));
        } else if (opcao == 3){
            System.out.println(redeSocial.enviar(mensagem));
        } else if (opcao == 4){
            System.out.println(whatsapp.enviar(mensagem));
        } else if(opcao == 5){
            System.out.println("Saindo do Sistema....");
        } else {
            System.out.println("Escolha uma opção valida.");
        }

        input.close();

    }

}
    

