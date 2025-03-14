import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        System.out.println(" El mayor de dos numeros");

        var consola = new Scanner(System.in);

        System.out.print("Proporciona el numero 1: ");
        var numero1 = Integer.parseInt(consola.nextLine());

        System.out.print("Proporciona el numero 2: ");
        var numero2 = Integer.parseInt(consola.nextLine());

        // El mayor de dos numeros
        if (numero1 > numero2)
            System.out.println("El numero 1 es mayor: " + numero1);
        else
            System.out.println("El numero 2 es mayor: " + numero2);
    }
}
