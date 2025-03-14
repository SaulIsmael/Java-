import java.util.Random;
import java.util.Scanner;

public class JuegosAdivinanzas {
    public static void main(String[] args) {
        System.out.println("*** Juego de Adivinanzas ***");
        var consola = new Scanner(System.in);
        var random = new Random();

        //Generamos un numero aleatorio entre 1 y 50
        var numeroSecreto = random.nextInt(50) + 1;
        var intentos = 0;
        var adivinanza = 0;
        final var INTENTOS_MAXIMOS = 5;

        while (adivinanza != numeroSecreto && intentos < INTENTOS_MAXIMOS ){
            System.out.print("Adivina el numero secreto (1-50): ");
            adivinanza = consola.nextInt();

            // Agregar una ayuda para orientar al jugador
            if (adivinanza < numeroSecreto)
                System.out.println("El numero secreto es mayor");
            else if (adivinanza > numeroSecreto)
                System.out.println("El numero secreto es menor");

            // Incrementamos la variable de intentos
            intentos++;

        }

        // Conclusion del juego
        if (adivinanza == numeroSecreto){
            System.out.printf("Felicidades, " +
                    "advinaste el número secreto en %d intentos%n", intentos);
        }
        else{
            System.out.printf("Lo siento, has agotado tus intentos maximos: %d%n",
                    INTENTOS_MAXIMOS);
            System.out.printf("El numero secreto era: %d%n ", numeroSecreto);
        }

    }
}
