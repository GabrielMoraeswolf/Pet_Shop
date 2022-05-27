package sistemaPetShop;

public class Data {
    protected int hora, dia, mes;

    public Data(int hora, int dia, int mes) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
    }

    public boolean setHora(int hora){
        this.hora = hora;
        return true;
    }

    public int getHora(){
        return hora;
    }

    public boolean setDia(int dia){
        this.dia = dia;
        return true;
    }

    public int getDia(){
        return dia;
    }

    public boolean setMes(int mes){
        this.mes = mes;
        return true;
    }

    public int getMes(){
        return mes;
    }

    public String toString() {
        return String.format("Data: %d/%d\nHorario: %d\n",
        getDia(), getMes(), getHora());
    }
}
