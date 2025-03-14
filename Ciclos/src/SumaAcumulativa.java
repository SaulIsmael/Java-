public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("*** Suma Acumulativa ***");

        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        // Iterar los valores
        var numero = 1;
        while (numero <= MAXIMO){
            // Imprimir lo que va a sumar
            System.out.println("(aculadorSuma + numero) -> "
            + acumuladorSuma + " + " + numero);

            // Realizar la suma acumulativa
            acumuladorSuma += numero++; // acumunadorSuma = acumuladorSuma + numero

            // Imprimir la suma parcial acumulada
            System.out.println("Suma parcial acumulada: " + acumuladorSuma + "\n");
        }
        System.out.println("Suma de los primeros "
               + MAXIMO + " numeros = " + acumuladorSuma);
    }
}
