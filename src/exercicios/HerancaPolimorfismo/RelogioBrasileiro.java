package exercicios.HerancaPolimorfismo;

public class RelogioBrasileiro extends Relogio{

    public RelogioBrasileiro(int hora,int minuto,int segundo){
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    };

    @Override
    public void sincronizar(Relogio outroRelogio){
        this.setHora(outroRelogio.getHora());
        this.setMinuto(outroRelogio.getMinuto());
        this.setSegundo(outroRelogio.getSegundo());

    };
    
}
