import java.util.Scanner;

public class SaludYFitness {
    public static void main(String[] args) {
        System.out.println("*** Salud y Fitness ***");

        // Constantes
        final var META_PASOS_DIARIOS = 10000;
        final var CALORIA_POR_PASO = 0.04; // Valor aproximado, son kilocalorias

        // Pedimos los valores al usuario
        var consola = new Scanner(System.in);

        System.out.print("Cual es tu nombre? ");
        var nombreUsuario = consola.nextLine();

        System.out.print("Cuantos pasos has caminado hoy? ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        // Verificar si el usuario alcanzo la meta de pasos diarios
        var metaAlcanzada = (pasosDiarios >= META_PASOS_DIARIOS) ? "si :)" : "No :(";

        // Calculamos las calorias quemadas
        var caloriasQuemadas = pasosDiarios * CALORIA_POR_PASO;

        // Mostramos la informacion
        System.out.printf("""
                %nUsuario: %s
                Pasos dados hoy: %d
                Calorias quemadas: %.2f kcal
                Meta de pasos diarios alcanzadas: %s
                ------------------------------------
                La meta de pasos diarios es de: %d pasos
                """, nombreUsuario, pasosDiarios, caloriasQuemadas,
                metaAlcanzada, META_PASOS_DIARIOS);


    }
}
