import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<Estacionamiento> estacionamientos = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            estacionamientos.add(new Estacionamiento("E" + i));
        }

        int opcion;
        boolean estado = true;

        do{
            System.out.println("\n----- Sistema de Gestión de Estacionamiento -----");
            System.out.println("1. Registrar Estacionamiento");
            System.out.println("2. Escoger Estacionamiento y Registrar Entrada de Vehículo");
            System.out.println("3. Mostrar Información de un Estacionamiento");
            System.out.println("4. Mostrar Consolidado de Estacionamientos");
            System.out.println("5. Reiniciar Estacionamiento");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el ID del nuevo estacionamiento; el cual debe estar conformado Por la Letra E seguido de un numero:: ");
                    String idEstacionamiento = teclado.next();
                    estacionamientos.add(new Estacionamiento(idEstacionamiento));
                    System.out.println("Estacionamiento " + idEstacionamiento + " registrado.");
                }
                case 2 -> {
                    System.out.println("Estacionamientos disponibles:");
                    for (Estacionamiento e : estacionamientos) {
                        System.out.println(e.getId());
                    }
                    System.out.print("Ingrese el ID del estacionamiento donde desea registrar la entrada: ");
                    String idSeleccionado = teclado.next();
                    Estacionamiento estacionamientoSeleccionado = null;
                    for (Estacionamiento e : estacionamientos) {
                        if (e.getId().equals(idSeleccionado)) {
                            estacionamientoSeleccionado = e;
                        }
                    }
                    if (estacionamientoSeleccionado != null) {
                        System.out.println("Seleccione el tipo de vehículo a estacionar:");
                        System.out.println("1. Automóvil");
                        System.out.println("2. Motocicleta");
                        System.out.println("3. Camión");
                        int tipoVehiculo = teclado.nextInt();
                        Vehiculo vehiculo = null;
                        switch (tipoVehiculo) {
                            case 1->{
                                vehiculo = new Automovil();
                            }
                            case 2 -> {
                                vehiculo = new Motocicleta();
                            }
                            case 3 -> {
                                vehiculo = new Camion();
                            }
                            default -> System.out.println("Opción no válida.");
                        }

                        System.out.print("Ingrese la cantidad de horas de estacionamiento: ");
                        int horas = teclado.nextInt();


                        estacionamientoSeleccionado.getVehiculosEstacionados().add(vehiculo);
                        estacionamientoSeleccionado.setTiempoTotalUso(estacionamientoSeleccionado.getTiempoTotalUso() + horas);
                        estacionamientoSeleccionado.setIngresosTotales(estacionamientoSeleccionado.getIngresosTotales() + vehiculo.getTarifaPorHora() * horas);
                        System.out.println("Vehículo registrado con éxito en " + idSeleccionado);
                    } else {
                        System.out.println("Estacionamiento no encontrado.");
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese el ID del estacionamiento: ");
                    String idMostrar = teclado.next();
                    Estacionamiento estacionamientoMostrar = null;
                    for (Estacionamiento e : estacionamientos) {
                        if (e.getId().equals(idMostrar)) {
                            estacionamientoMostrar = e;
                        }
                    }
                    if (estacionamientoMostrar != null) {
                        System.out.println(estacionamientoMostrar);
                    } else {
                        System.out.println("Estacionamiento no encontrado.");
                    }
                }
                case 4 -> {
                    int totalVehiculos = 0;
                    int totalHoras = 0;
                    double ingresosTotales = 0;
                    for (Estacionamiento e : estacionamientos) {
                        totalVehiculos += e.getVehiculosEstacionados().size();
                        totalHoras += e.getTiempoTotalUso();
                        ingresosTotales += e.getIngresosTotales();
                    }
                    System.out.println("Consolidado de todos los estacionamientos:");
                    System.out.println("Número total de vehículos estacionados: " + totalVehiculos);
                    System.out.println("Tiempo total de uso (horas): " + totalHoras);
                    System.out.println("Ingresos totales generados: " + ingresosTotales);

                }
                case 5 -> {

                    System.out.print("Ingrese el ID del estacionamiento a reiniciar: ");
                    String idReiniciar = teclado.next();
                    Estacionamiento estacionamientoReiniciar = null;
                    for (Estacionamiento e : estacionamientos) {
                        if (e.getId().equals(idReiniciar)) {
                            estacionamientoReiniciar = e;
                        }
                    }
                    if (estacionamientoReiniciar != null) {
                        estacionamientoReiniciar.setVehiculosEstacionados(new ArrayList<>());
                        estacionamientoReiniciar.setTiempoTotalUso(0);
                        estacionamientoReiniciar.setIngresosTotales(0.0);
                        System.out.println("Estacionamiento " + idReiniciar + " reiniciado.");
                    } else {
                        System.out.println("Estacionamiento no encontrado.");
                    }
                }
                case 6-> {
                    System.out.println("Saliendo...");
                    estado = false;

                }
                default -> System.out.println("Opción no válida.");
            }

        }while (estado);

    }
}