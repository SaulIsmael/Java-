import java.util.Scanner;

public class CalculoAreaRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Calculo del Area de un Rectangulo ***");

        var consola = new Scanner(System.in);

        System.out.print("Proporciona la base: ");
        var base = Integer.parseInt(consola.nextLine());

        System.out.print("Proporciona la altura: ");
        var altura = Integer.parseInt(consola.nextLine());

        // Realizamos el calculo del area
        var areaRectangulo = base * altura;
        System.out.println("Area del rectangulo: " + areaRectangulo);

        //Realizamos el calculo del perimetro
        var perimetroRectangulo = (base + altura) * 2;
        System.out.println("Perimetro del rectangulo: " + perimetroRectangulo);
    }
}
