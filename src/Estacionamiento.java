import java.util.*;

public class Estacionamiento {

    private String id;
    private List<Vehiculo> vehiculosEstacionados;
    private int tiempoTotalUso;
    private double ingresosTotales;


    public Estacionamiento() {

    }


    public Estacionamiento(String id) {
        this.id = id;
        this.vehiculosEstacionados = new ArrayList<>();
        this.tiempoTotalUso = 0;
        this.ingresosTotales = 0.0;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Vehiculo> getVehiculosEstacionados() {
        return vehiculosEstacionados;
    }

    public void setVehiculosEstacionados(List<Vehiculo> vehiculosEstacionados) {
        this.vehiculosEstacionados = vehiculosEstacionados;
    }

    public int getTiempoTotalUso() {
        return tiempoTotalUso;
    }

    public void setTiempoTotalUso(int tiempoTotalUso) {
        this.tiempoTotalUso = tiempoTotalUso;
    }

    public double getIngresosTotales() {
        return ingresosTotales;
    }

    public void setIngresosTotales(double ingresosTotales) {
        this.ingresosTotales = ingresosTotales;
    }


    @Override
    public String toString() {
        return "Estacionamiento{" +
                "id='" + id + '\'' +
                ", vehiculosEstacionados=" + vehiculosEstacionados.size() +
                ", tiempoTotalUso=" + tiempoTotalUso +
                ", ingresosTotales=" + ingresosTotales +
                '}';
    }
}
