package exercicios.HerancaPolimorfismo;

import java.util.Scanner;

/* Crie uma hierarquia de classes que definam os tipos de usuários de um sistema, use os seguintes requisitos:

Classe Gerente que terá os atributos: Nome, Email, Senha e um atributo que informa se ele é administrador, esse último deve ser sempre verdadeiro;
Classe Vendedor que terá os seguintes atributos: Nome, Email, Senha, Quantidade de vendas e um atributo que informa se ele é administrador, esse útimo deve ser sempre falso;
Classe Atendente que terá os seguintes atributos: Nome, Email, Senha, Valor em caixa e um atributo que informa se ele é administrador, esse ultimo deve ser sempre falso.
Cada classe deve ter seus respectivos getters e setters ( para atributos que façam sentido ter) e as classes devem ter os seguintes métodos

A classe Gerente deve ter os métodos Gerar relatório financeiro, Consultar vendas, Realizar login, Realizar logff, alterar dados, alterar senha;
A classe Vendedor deve ter os métodos Realizar venda ( incrementar o número de vendas quando acionado), Consultar vendas, Realizar login, Realizar logoff, alterar dados, alterar senha;
A classe Atendente deve ter os métodos Receber pagamentos (onde o método recebe um valor que deve ser incrementado no valor em caixa), Fechar o caixa, Realizar Login, Realizar logoff, alterar dados e alterar senha; */

public class TesteUsuarioSistema {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("--- INICIALIZANDO SISTEMA LOJA JS ---");
        Gerente gerente = new Gerente("Jorbson (Gerente)", "gerente@lojajs.com", "123");
        Vendedor vendedor = new Vendedor("Ana (Vendas)", "ana@lojajs.com", "venda123");
        Atendente atendente = new Atendente("Rute (Caixa)", "rute@lojajs.com", "caixa123");

        System.out.println("Equipe carregada com sucesso!");

        while (true) {

            System.out.println("=========================================");
            System.out.println("  PAINEL DE SIMULAÇÃO - LOJA JS");
            System.out.println("=========================================");
            System.out.println("Escolha com qual perfil deseja interagir:");
            System.out.println("1 - Operar como Vendedor (" + vendedor.getNome() + ")");
            System.out.println("2 - Operar como Atendente (" + atendente.getNome() + ")");
            System.out.println("3 - Operar como Gerente (" + gerente.getNome() + ")");
            System.out.println("0 - Desligar Sistema");
            System.out.print("Opção: ");
            int perfil = input.nextInt();

            if (perfil == 1){
                
                System.out.println("---[ Painel do Vendedor ]---");
                System.out.println("1 - Realizar Venda");
                System.out.println("2 - Consultar minhas vendas");
                int opVendedor = input.nextInt();
                
                if (opVendedor == 1) {
                    vendedor.vendaConcluida();
                    System.out.println("✅ Venda registrada! Boa, " + vendedor.getNome() + "!");
                } else if (opVendedor == 2) {
                    System.out.println("📊 Você já realizou " + vendedor.getQtdVendas() + " vendas hoje.");
                }
                
            } else if(perfil == 2 ){

                System.out.println("---[ Painel do Atendente ]---");
                System.out.println("1 - Receber Pagamento");
                System.out.println("2 - Ver saldo atual");
                System.out.println("3 - Fechar Caixa");
                int opAtendente = input.nextInt();

                if (opAtendente == 1) {
                    System.out.print("Digite o valor recebido: R$ ");
                    double valor = input.nextDouble();
                    atendente.receberPagamento(valor);
                    System.out.println("Pagamento recebido!");
                } else if (opAtendente == 2) {
                    System.out.println("Saldo no caixa: R$ " + atendente.getValorCaixa());
                } else if (opAtendente == 3) {
                    atendente.fecharCaixa();
                }

            } else if(perfil == 3){

                System.out.println("---[ Painel da Gerência ]---");
                System.out.println("1 - Consultar relatório de vendas (Auditar Ana)");
                System.out.println("2 - Gerar relatório financeiro (Auditar Rute)");
                int opGerente = input.nextInt();

                if (opGerente == 1) {
                    
                    gerente.consultarVendas(vendedor);
                } else if (opGerente == 2) {
                    
                    gerente.relatorioFinanceiro(atendente);
                } 

            } else if (perfil == 0){
                System.out.println("Desligando o sistema...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
            
        }
        input.close();
    }
}
