import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("*** Validacion de Password ***");

        System.out.print("Ingrese un password (de al menos 6 caracteres): ");
        var password = consola.nextLine();

        //Valida el password
        while (password.length() < 6) {
            System.out.println("El password no cumple con los requisitos. " +
                    "Debe tener al menos 6 caracteres");
            System.out.println("Ingresa un nuevo valor de password: ");
            password = consola.nextLine();
        }
        System.out.println("El valor de password es valido: " + password);
        }
    }

