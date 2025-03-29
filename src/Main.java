import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Estacionamiento aireLibre = new EstacionamientoAireLibre("Estacionamiento AireLibre", 50);
        Estacionamiento subterraneo = new EstacionamientoSubterraneo("Estacionamiento Subterráneo", 30);

        Registrable registro = new RegistroEstacionamiento();

        int opcion;
        do {
            System.out.println("""
                    |====================================|
                    |     GESTIÓN DE ESTACIONAMIENTO     |
                    |====================================|
                    | 1. VER INFORMACIÓN ESTACIONAMIENTO |
                    | 2. CALCULAR TARIFA                 |
                    | 3. REGISTRAR VEHICULO              |
                    |====================================|
                    | 4. SALIR DEL PROGRAMA              |
                    |====================================|
                    
                    Seleccione una Opción: 
                    """);
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    aireLibre.mostrarInfo();
                    subterraneo.mostrarInfo();
                } case 2 -> {
                    System.out.print("Ingrese el número de horas: ");
                    int horas = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Tarifa en Aire Libre: $" + aireLibre.calcularTarifa(horas));
                    System.out.println("Tarifa en Subterráneo: $" + subterraneo.calcularTarifa(horas));


                }case 3 -> {
                    System.out.print("Ingrese la placa del vehículo: ");
                    String placa = scanner.nextLine();

                    System.out.println("Seleccione el estacionamiento:");
                    System.out.println("1. Aire Libre");
                    System.out.println("2. Subterráneo");
                    System.out.print("Opción: ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    if (tipo == 1) {
                        System.out.println("Registrando en Aire Libre...");
                        registro.registrarVehiculo(placa);
                    } else if (tipo == 2) {
                        System.out.println("Registrando en Subterráneo...");
                        registro.registrarVehiculo(placa);
                    } else {
                        System.out.println("Opción no valida.");
                    }

                }case 4 -> {
                    System.out.println("Saliendo del sistema...");

                }default -> {
                    System.out.println("Opción no valida.");
                    }
            }
        } while (opcion != 4);

        scanner.close();
    }
}
