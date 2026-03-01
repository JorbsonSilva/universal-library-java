package exercicios.HerancaPolimorfismo;

public class RelogioAmericano extends Relogio{

    private String periodo;

        
    public RelogioAmericano(int hora, int minuto, int segundo, String periodo){
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
        this.periodo = periodo;
    }

    @Override
    public String getHoraFormatada(){
        return super.getHoraFormatada() + " " + this.periodo.toUpperCase();
    }

    @Override
    public int getHoraUniversal(){
        if(this.periodo.equalsIgnoreCase("PM")&& this.getHora()<12){
            return getHora() + 12;
        } else if (this.periodo.equalsIgnoreCase("AM")&& this.getHora() == 12){
            return 0;
        }else {
            return this.getHora();
        }
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
        int horaUniversal = outroRelogio.getHoraUniversal();
        if (horaUniversal == 0){
            this.setHora(12);
            this.periodo = "AM";
        } else if (horaUniversal >= 1 && horaUniversal <= 11) {
            this.setHora(horaUniversal);
            this.periodo = "AM";
        } else if (horaUniversal == 12) {
            this.setHora(12);
            this.periodo = "PM";
        } else {
            this.setHora(horaUniversal - 12);
            this.periodo = "PM";
        }
        this.setMinuto(outroRelogio.getMinuto());
        this.setSegundo(outroRelogio.getSegundo());
    }
    
}
