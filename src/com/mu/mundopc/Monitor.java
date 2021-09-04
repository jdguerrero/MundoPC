package mundopc;

public class Monitor {

    private int idMonitor;

    private String marca;

    private double tamano;

    private int contadorMonitores;

    public Monitor (){

    }

    public Monitor(String marca, double tamano){
        this.contadorMonitores++;
        this.marca = marca;
        this.tamano=tamano;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamano=" + tamano +
                ", contadorMonitores=" + contadorMonitores +
                '}';
    }
}
