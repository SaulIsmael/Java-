public class IndicesCadena {
    public static void main(String[] args) {
    // Manejo de indices de una cadena
    var cadena1 = "Hola Mundo";

    //Recuperar el primer caracter
    var primerCaracter = cadena1.charAt(0); // Recuperar el caracter de 'H'
    System.out.println("primerCaracter = " + primerCaracter);
    //Recuperar el ultimo caracter (en la pisicion 9)
    var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
    //Recuperar el caracter M(en la pisicion 5)
    var caracterMedio = cadena1.charAt(5);
        System.out.println("caracterMedio = " + caracterMedio);


    }
}
