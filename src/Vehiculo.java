public class Vehiculo {
    protected String tipo;
    protected double tarifaPorHora;
    protected boolean disponible;


    public Vehiculo() {
        this.tipo = "";
        this.tarifaPorHora = 0.0;
        this.disponible = true;
    }


    public Vehiculo(String tipo, double tarifaPorHora) {
        this.tipo = tipo;
        this.tarifaPorHora = tarifaPorHora;
        this.disponible = true;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    public boolean esDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo='" + tipo + '\'' +
                ", tarifaPorHora=" + tarifaPorHora +
                ", disponible=" + disponible +
                '}';
    }
}

