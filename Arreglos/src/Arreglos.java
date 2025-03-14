import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        // Introducir valores a un arreglo
        var consola = new Scanner(System.in);
        // Declarar el arreglo
        System.out.print("Proporciona el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        // Creamos de manera dinamica el arreglo
        var enteros = new int[largoArreglo];
        // Solicitar los valores del arreglo
        for (var i=0; i < largoArreglo; i++){
            System.out.print("Proporciona enteros[" + i + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());

        }
        // Imprimir los valores del arreglo
        System.out.println("\nImpresion del arreglo: ");
        for (var i=0; i < largoArreglo; i++)
        System.out.println("enteros[" + i + "] = " + enteros[i]);




       //EJEMPLO:
        // Arreglos
        //var enteros = new int[]{100,200,300,400,500};
        // Iterar los elementos de arreglo
        //for (var i = 0; i < enteros.length; i++){
        //    System.out.println("Valor del indice: " + i + " = " + enteros[i]);
        //}


        //EJEMPLO:
        //int [] enteros = {100,200,300,400,500};
        //var enteros = new int []{100,200,300,400,500};
        // Acceder a los elementos
        //System.out.println("Valor 1: " + enteros[0]);
        //System.out.println("Valor 2: " + enteros[1]);
        //System.out.println("Valor 3: " + enteros[2]);
        //System.out.println("Valor 4: " + enteros[3]);
        //System.out.println("Valor 5: " + enteros[4]);
        // Imprimir el arreglo
        //System.out.println("Imprimir el arreglo: " + enteros);




        // EJEMPLO:
        // Modificar los elementos
        //enteros[0] = 13;
        //enteros[1] = 21;
        //enteros[4] = 62;
        // Leer los elementos de un arreglo
        //System.out.println("Valor 1 = " + enteros[0]);
        //System.out.println("Valor 2 = " + enteros[1]);
        //System.out.println("Valor 5 = " + enteros[4]);
    }

}
