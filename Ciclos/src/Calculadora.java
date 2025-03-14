import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        double operando1 = 0, operando2 = 0, resultado;
        var salir = false;
        // Ciclo para la aplicacion de Calculadora
        while (!salir){
            System.out.print("""
                    *** Calculadora en Java ***
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    Escoge una opcion:\s""");
            var opcion = consola.nextInt();

            if (opcion >= 1 && opcion <= 4){
                System.out.print("Dame el valor 1: ");
                operando1 = consola.nextDouble();
                System.out.print("Dame el valor 2: ");
                operando2 = consola.nextDouble();
            }

            switch (opcion){
                case 1 -> {// Suma
                    resultado = operando1 + operando2;
                    System.out.printf("Resultado suma: %.2f%n%n", resultado);

                }
                case 2 -> {// Resta
                    resultado = operando1 - operando2;
                    System.out.printf("Resultado resta: %.2f%n%n", resultado);
                }
                case 3 -> {// Multiplicacion
                    resultado = operando1 * operando2;
                    System.out.printf("Resultado Multiplicacion: %.2f%n%n", resultado);
                }
                case 4 -> {// Division
                    if (operando2 != 0) {
                        resultado = operando1 / operando2;
                        System.out.printf("Resultado Division: %.2f%n%n", resultado);
                    }
                    else
                        System.out.println("Error: Division entre cero. \n");
                }
                case 5 ->{// Salir
                    System.out.println("Saliendo del programa de Calculadora!");
                    salir = true;

                }
                default -> System.out.println("Opcion invalida, " +
                        "selecciona otra opcion...\n");
            }
        }
    }
}
