public class Camion extends Vehiculo {


    public Camion() {
        super("Camion", 250.0);
    }


    public Camion(String tipo, double tarifaPorHora) {
        super(tipo, tarifaPorHora);
    }


    @Override
    public String toString() {
        return "Camion{" + super.toString() + "}";
    }
}
