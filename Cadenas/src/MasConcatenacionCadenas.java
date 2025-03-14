public class MasConcatenacionCadenas {
    public static void main(String[] args) {
     // Mas formas de concatenar cadenas en java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 usando + = " + cadena3);
        // Metodo concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando concat = " + cadena3);


        // StringBuilder
        var construsctorCadenas = new StringBuilder();
        construsctorCadenas.append(cadena1);
        construsctorCadenas.append(" ");
        construsctorCadenas.append(cadena2);
        var resultado = construsctorCadenas.toString();
        System.out.println("resultado = " + resultado);

        // StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("stringBuffer = " + stringBuffer);


        // join
        resultado = String.join(" ", cadena1, cadena2, "Adios");
        System.out.println("stringBuffer = " + resultado);



    }
}
