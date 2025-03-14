import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hotel ***");

        //Variables del hotel
        final var TARIFA_DIARIA_SIN_VISTA_MAR = 150.50;
        final var TARIFA_DIARIA_CON_VISTA_MAR = 190.50;

        // Pedimos la informacion al cliente
        var consola = new Scanner(System.in);

        System.out.print("Nombre del Cliente: ");
        var nombreCliente = consola.nextLine();

        System.out.print("Dias de estadias: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());

        System.out.print("Con vista al mar (true/false)? ");
        var conVistaAlMar = Boolean.parseBoolean(consola.nextLine());

        // Calcular de costo total de la estadia
        var costoTotal = 0.0;
        if (conVistaAlMar) {
            costoTotal = diasEstadia * TARIFA_DIARIA_CON_VISTA_MAR;}
        else
            costoTotal = diasEstadia * TARIFA_DIARIA_SIN_VISTA_MAR;

        // Mostramos los detalles de la reserva
            System.out.printf("""
                    %n--------- Detalle de la Reserva ---------
                    Cliente: %s 
                    Dias de estadia: %d
                    Costo total: $%.2f
                    Habitacion con vista al mar: %s
                    """, nombreCliente, diasEstadia, costoTotal,
                    conVistaAlMar ? "Si :)" : "No :(");
    }
}
