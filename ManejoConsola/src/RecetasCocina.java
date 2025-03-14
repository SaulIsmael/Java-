import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        System.out.println("*** Receta de Concina ***");

        var consola =  new Scanner(System.in);
        System.out.print("Ingresa el nombre de la receta: ");
        var nombreReceta = consola.nextLine();


        //Ingredientes
        System.out.print("Ingresa los Ingredientes: ");
        var ingredientes = consola.nextLine();

        //Tiempo de preparacion
        System.out.print("Ingrese el tiempo de preparacion (min): ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        // Dificultad de la preparacion
        System.out.print("Ingresa la dificultad (Facil/Medio/Dificil): ");
        var dificultadPreparacion = consola.nextLine();

        //Imprimir los valores de receta
        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("\tNombre receta: " + nombreReceta);
        System.out.println("\tIngredientes: " + ingredientes);
        System.out.println("\tTiempo de preparacion: " + tiempoPreparacion);
        System.out.println("\tDificultad: " + dificultadPreparacion);


    }
}
