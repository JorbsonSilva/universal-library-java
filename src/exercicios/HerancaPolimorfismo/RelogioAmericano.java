package exercicios.HerancaPolimorfismo;

public class RelogioAmericano extends Relogio{

        
    public RelogioAmericano(int hora, int minuto, int segundo){
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    }

    @Override
    public void setHora(int hora){
        if(hora >=0 && hora <= 12){
            super.setHora(hora);
        } else if(hora>12 && hora <=23){
            super.setHora(hora - 12);
        } else{
            System.out.println("Porfavor escolha entre 0 a 12 horas");
        }
    }

    @Override
    public void sincronizar(Relogio outroRelogio){
        this.setHora(outroRelogio.getHora());
        this.setMinuto(outroRelogio.getMinuto());
        this.setSegundo(outroRelogio.getSegundo());
    }
    
}
