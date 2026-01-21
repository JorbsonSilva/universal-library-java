package exercicios;

/* Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:
Ligar o carro; feito
Desligar o carro; feito
Acelerar; feito
diminuir velocidade; feito
virar para esquerda/direita feito
verificar velocidade; feito
trocar a marcha feito
Siga as seguintes regras na implementação

Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0
O carro desligado não pode realizar nenhuma função;
Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km);
Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua velocidade (pode chegar no minimo a 0km);
o carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro;
A velocidade do carro deve respeitar os seguintes limites para cada velocidade
se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km
O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km
O carro só pode virar para esquerda/direita se sua velocidade for de no mínimi 1km e no máximo 40km; */

public class Carro {
   
    private int velocidade;
    private boolean estado;
    private int marcha;

    public Carro (){        
        this.velocidade = 0;
        this.estado = false;
        this.marcha = 0;
    }      

    public int getVelocidade(){
        return velocidade;
    }

    public String getEstado(){
        if (estado ==false){
            return "Carro está desligado.";
        } else {
            return "Carro está ligado.";
        }
    }

    public boolean isLigado() {
        return estado;
    }

    public void setEstado(boolean valor){
        if(valor == true){
            this.estado = valor;
            System.out.println("Carro foi ligado.");
        } else if(valor == false && velocidade == 0 && marcha == 0){
            this.estado = valor; 
            System.out.println("Carro foi desligado.");
        } else {
            System.out.println("Não foi possivel desligar o carro, verifique a velocidade e a marcha.");
        }
        
    }

    public int getMarcha(){
        return marcha;
    }

    public void subirMarcha(){
        if(estado == true){
            if(marcha<6){
                this.marcha++;
            } else {
                System.out.println("Marcha limite alcançada.");
            }
        } else {
            System.out.println("Carro se encontra desligado.");
        }
    }

    public void descMarcha(){
        if(estado == true){
            if(marcha>0){
                this.marcha--;
            } else {
                System.out.println("Carro ja se encontra em ponto morto.");
            }
        }else {
                System.out.println("Carro se encontra desligado.");
        }
    }

    public void acelerar(int valor){
        if(estado == false){
            System.out.println("Não foi possivel acelerar o carro pois o mesmo se encontra desligado.");
        } else if (marcha == 0){
            System.out.println("O carro se encontra ligado mas nao foi possivel acelerar pois estar em ponto morto.");
        }else {
            if(velocidade == 120){
                System.out.println("Velocidade máxima alcançada!!!!");
            }else{
                if (velocidade <= 20 && marcha == 1){
                    this.velocidade++;            
                } else if(velocidade < 40 && marcha == 2){
                    this.velocidade++;
                } else if(velocidade < 60 && marcha == 3){
                    this.velocidade++;
                } else if(velocidade < 80 && marcha == 4){
                    this.velocidade++;
                } else if(velocidade < 100 && marcha == 5){
                    this.velocidade++;
                } else if(velocidade < 120 && marcha == 6){
                    this.velocidade++;
                } else {
                    System.out.println("Você deve almentar a marcha para continuar a acelerar.");
                }
            }
        }
    }

    public void desacelerar(int valor){
        if(estado == false){
            System.out.println("Não foi possivel desacelerar pois o mesmo se encontra desligado.");
        } else if (marcha == 0){
            System.out.println("O carro se encontra ligado mas nao foi possivel desacelerar pois estar em ponto morto.");
        }else {
            if(velocidade == 0){
                System.out.println("Velocidade minima alcançada!!!!");
            }else{
                if (velocidade >= 1 && marcha == 1){
                    this.velocidade--;            
                } else if(velocidade > 21 && marcha == 2){
                    this.velocidade--;
                } else if(velocidade > 41 && marcha == 3){
                    this.velocidade--;
                } else if(velocidade > 61 && marcha == 4){
                    this.velocidade--;
                } else if(velocidade > 81 && marcha == 5){
                    this.velocidade--;
                } else if(velocidade > 101 && marcha == 6){
                    this.velocidade--;
                } else {
                    System.out.println("Você deve diminuir a marcha para continuar a desacelerar.");
                }
            }
        }
    }

    public void virar(String valor){
        if(velocidade <=40 && velocidade > 0){
            if(valor.equals("Direita")){
                System.out.println("Carro virou para direita!!!!");
            } else if(valor.equals("Esquerda")){
                System.out.println("Carro virou para esquerda!!!!");
            } else {
                System.out.println("Escolha uma opcão valida(Direita ou Esquerda).");
            }
        } else {
            System.out.println("Velocidade acima do permitido, risco de acidente. Diminua a velocidade!!!!");
        }
    }
}
