package exercicios;

/* Escreva um código onde temos o controle de banho de um petshop, a maquina de banhos dos pets deve ter as seguintes operações:
Dar banho no pet;
Abastecer com água;
Abastecer com shampoo;
verificar nivel de água;
verificar nivel de shampoo;
verificar se tem pet no banho;
colocar pet na maquina;
retirar pet da máquina;
limpar maquina.
Siga as seguintes regras para implementação

A maquina de banho deve permitir somente 1 pet por vez;
Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo;
A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo;
Se o pet for retirado da maquina sem estar limpo será necessário limpar a máquina para permitir a entrada de outro pet;
A limpeza da máquina ira consumir 3 litros de água e 1 litro de shampoo;
O abastecimento de água e shampoo deve permitir 2 litros por vez que for acionado; */

public class MaquinaBanho {

                            // ATRIBUTOS //

    // private: Significa que ninguém de fora (nenhuma outra classe) pode mexer nessas variáveis diretamente.
    private double agua;
    private double shampoo; // double: Variáveis numéricas para guardar a quantidade de líquido.
    private boolean temPet;
    private boolean maquinaLimpa; // boolean: É uma chave de liga/desliga (Verdadeiro ou Falso).
    private boolean petLimpo;

                            // CONSTRUTOR //

    // Construtor: Valores pré-definidos quando inicia um novo objeto.
    public MaquinaBanho(){
        this.agua = 0;
        this.shampoo = 0;
        this.temPet = false;
        this.maquinaLimpa = true;
        this.petLimpo = false;
    }

                            // METODOS //

    public void colocarPet(){
        if(temPet == true){ // Permitir somente 1 pet por vez.
            System.out.println("Erro: Já tem um pet na máquina!");
        } else if (maquinaLimpa == false){ // Limpar a máquina para permitir a entrada de outro pet.
            System.out.println("A máquina está suja! Limpe antes.");
        } else {
            this.temPet = true;
            this.petLimpo = false;
            System.out.println("Pet colocado na máquina.");
        }
    }
    public void darBanho(){
        if (temPet == false){
            System.out.println("Coloque um pet primeiro.");
            return;
        }
        if (this.agua >=10 && this.shampoo>=2){
            this.agua -= 10;
            this.shampoo -= 2;
            this.petLimpo = true;
            System.out.println("Banho Finalizado!!!");
        } else {
            System.out.println("Falta água ou Shampoo!!!!");
        }
    }

    public void retirarPet(){
        if (petLimpo == true){
            System.out.println("Pet saiu limpo. Máquina continua limpa.");
        } else {
            System.out.println("Pet saiu SUJO! A máquina se sujou.");
            this.maquinaLimpa = false;
        }
        this.temPet = false;
    }

    public void limparMaquina(){
        if (agua >= 3 && shampoo >=1){
            this.agua -= 3;
            this.shampoo -= 1;
            this.maquinaLimpa = true;
            System.out.println("Máquina Limpa!!!!");
        } else {
            System.out.println("Falta água ou Shampoo!!!!");
        }
    }

    public void abastecerAgua(){
        if(this.agua + 2 <=30){
            this.agua +=2;
            System.out.println("Abastecido. Total: " + this.agua);
        } else {
            System.out.println("Tanque cheio! Não cabe mais 2 litros.");
        }
    }

    public void abastecerShampoo(){
        if(this.shampoo + 2 <=10){
            this.shampoo +=2;
            System.out.println("Abastecido. Total: " + this.shampoo);
        } else {
            System.out.println("Tanque cheio! Não cabe mais 2 litros.");
        }
    }

    public double getAgua(){
        return agua;
    }

    public double getShampoo(){
        return shampoo;
    }
}