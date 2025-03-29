public class Motocicleta extends Vehiculo {


        public Motocicleta() {
            super("Motocicleta", 110.0);
        }


        public Motocicleta(String tipo, double tarifaPorHora) {
            super(tipo, tarifaPorHora);
        }


        @Override
        public String toString() {
            return "Motocicleta{" + super.toString() + "}";
        }
    }

