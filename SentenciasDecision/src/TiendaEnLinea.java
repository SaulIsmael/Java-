import java.util.Scanner;

public class TiendaEnLinea {
    public static void main(String[] args) {
        System.out.println("*** Tienda en Linea con Descuento ***");

        //Condiciones
        final var MONTO_COMPRA_DESC = 1000.00;

        var consola = new Scanner(System.in);

        System.out.print("Cual fue el monto de tu compra? ");
        var montoCompra = Double.parseDouble(consola.nextLine());

        System.out.print("Eres miembro de la tienda (ture/false)? ");
        var eresMiembro = Boolean.parseBoolean(consola.nextLine());

        // Calculamos el descuento
        var descuento = 0.0;
        // Verificamos cada caso, con los datos proporcionados
        if (montoCompra >= MONTO_COMPRA_DESC && eresMiembro) {
            descuento = 0.1; // Descuento del 10%
        } else if (eresMiembro) {
            descuento = 0.05; // Descuento del 5%
        } else {//No supero el monto minimo ni es miebro
            descuento = 0; //Descuento del 0%
        }


        //Hacemos los calculos respectivos para obtener el monto final
        if (descuento != 0) {
            var monotoDescuento = montoCompra * descuento;
            var montoFinal = montoCompra - monotoDescuento;
            System.out.printf("""
                     %nFelicidades!, has obtenido un descuento del %.0f%%
                    Monto de la compra: $%.2f
                    Monto del descuento: $%.2f
                    Monto final de la compra con descuento: $%.2fn
                    """, descuento * 100, montoCompra, monotoDescuento, montoFinal);
        }
        else {
            System.out.printf("""
                    %nNo obtuviste ningun tipo de descuento
                    Te invitamos a hacerte miembro de la tienda!
                    Monto final de la compra: $%.2f%n
                    """, montoCompra);
        }
    }
}