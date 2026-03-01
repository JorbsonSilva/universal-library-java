package exercicios.HerancaPolimorfismo;

public class RelogioBrasileiro extends Relogio{

    

    public RelogioBrasileiro(int hora,int minuto,int segundo){
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    };

    @Override
    public int getHoraUniversal(){
        return this.getHora();
    }

    @Override
    public void sincronizar(Relogio outroRelogio){
        this.setHora(outroRelogio.getHoraUniversal());
        this.setMinuto(outroRelogio.getMinuto());
        this.setSegundo(outroRelogio.getSegundo());

    };
    
}
