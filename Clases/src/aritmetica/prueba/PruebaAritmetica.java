package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo aritmetica.Aritmetica");
        var aritmentica1 = new Aritmetica(5,7);
        System.out.println("Atributo operando1: " + aritmentica1.getOperando1());
        aritmentica1.setOperando1(10);
        aritmentica1.setOperando2(15);
        aritmentica1.sumar();
        aritmentica1.restar();
        // Creamos un segundo objeto
        System.out.println();
        var aritmetica2 = new Aritmetica(12,16);
        aritmetica2.sumar();
    }
}
