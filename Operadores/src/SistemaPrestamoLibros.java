import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema Prestamo Libros ***");

        final var DISTANCIA_PERMITIDAS_KM = 3;
        var consola = new Scanner(System.in);

        System.out.println("Cuentas con credencial de estudiante (true/false)");
        var tienesCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("A cuanto Km vives de la biblioteca? ");
        var distancaBibliotecaKm = Integer.parseInt(consola.nextLine());

        var esElegiblePrestamo = tienesCredencial || distancaBibliotecaKm <= DISTANCIA_PERMITIDAS_KM;


        System.out.println("Eres elegible para prestamo de libros ? " + esElegiblePrestamo);
    }
}
