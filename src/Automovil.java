public class Automovil extends Vehiculo {


        public Automovil() {
            super("Automovil", 160.0);
        }


        public Automovil(String tipo, double tarifaPorHora) {
            super(tipo, tarifaPorHora);
        }



        @Override
        public String toString() {
            return "Automovil{" + super.toString() + "}";
        }
    }

