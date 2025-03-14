import java.util.Scanner;

public class CadaDeLosEspejos {
    public static void main(String[] args) {
        System.out.println("*** Bienvenidos a la Casa de los Espejos ***");



        var consola = new Scanner(System.in);

        System.out.print("Cual es tu edad? ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.print("Tienes miedo a la oscuridad (true/false)? ");
        var tieneMiedoOscuridad = Boolean.parseBoolean(consola.nextLine());

        // Verificacion
        if (!tieneMiedoOscuridad && edad >= 10) {
            ;
            System.out.println("Puedes entrar a la Casa de los Espejos");
        }
        else {
            System.out.println("Lo siento, la Casa de los Espejos podria date miedo");
        }
    }

}
