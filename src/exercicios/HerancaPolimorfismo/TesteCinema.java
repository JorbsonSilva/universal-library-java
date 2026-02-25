package exercicios.HerancaPolimorfismo;

import java.util.Scanner;

public class TesteCinema {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Cadastro de ingresso do Cinema.");
        System.out.println("Digite o nome do Filme:");
        String nomeFilme = input.next();
        System.out.println("Digite o valor do ingresso:");
        double valor = input.nextDouble();
        System.out.println("O filme é dublado?(Sim/Não).");
        String respota = input.next();
        boolean dublado;
            if (respota.equalsIgnoreCase("Sim")){
                dublado = true;
            } else {
                dublado = false;
            }
        
        System.out.println("Qual tipo de ingresso o cliente quer comprar?");
        System.out.println("1 - Ingresso Normal (Inteira)");
        System.out.println("2 - Meia Entrada");
        System.out.println("3 - Ingresso Família");
        int tipo = input.nextInt();

        Ingresso ingressoVendido = null; 

        if (tipo == 1) {
            ingressoVendido = new Ingresso(nomeFilme, valor, dublado);
            
        } else if (tipo == 2) {
            ingressoVendido = new MeiaEntrada(nomeFilme, valor, dublado);
            
        } else if (tipo == 3) {
            System.out.println("Quantas pessoas na família?");
            int qtdPessoas = input.nextInt();
            ingressoVendido = new IngressoFamilia(nomeFilme, valor, dublado, qtdPessoas);
        }
        if (ingressoVendido != null) {
            System.out.println("--- RECIBO DO CINEMA ---");
            System.out.println("Filme: " + ingressoVendido.getFilmeNome());
            System.out.println("Valor total a pagar: R$ " + ingressoVendido.calcularValorReal());
        } else {
            System.out.println("Opção inválida, venda cancelada.");
        }
        
        input.close();
    }
    
}
