import java.util.Scanner;

public class SistemasEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Envios ***");

        //Definimos las tarifas de envio por kg
        final var TARIFA_NACIONAL = 10.0;
        final var TARIFA_INTERNACIONAL = 20.0;

        // Solicitamos los valores de destino y peso
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el destino del paquete (nacional/internacional): ");
        var destino = consola.nextLine().strip().toLowerCase();

        System.out.print("Ingresa el peso del paquete (en Kg): ");
        var peso = Double.parseDouble(consola.nextLine());

        // Caolculo del envio del paquete
        Double costoEnvio = switch (destino) {
            case "nacional" -> peso * TARIFA_NACIONAL;
            case "internacional" -> peso * TARIFA_INTERNACIONAL;
            default -> {
                System.out.println("Destino invalido. Ingrese nacional/internacional");
                yield null;


            }

        };
        // Mostramos el costo de envio
        if (costoEnvio != null)
            System.out.printf("El costo de envio de paquete es: $%.2f", costoEnvio);


    }
}
