public class BusquedasSubcadenas {
    public static void main(String[] args) {
        // Buscar subcadenas
        // index0f - Devuelve el indice de la primera aparicion de la subcadena
        var cadena1 = "Hola Mundo";
        // subcadena a buscar "hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);
        // lasIndex0f - devuelve el indice de la ultima aparcicion de la subcadena
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);
        // subcadena no encontrada devuelve -1
        var indice3 = cadena1.lastIndexOf("java");
        System.out.println("indice3 = " + indice3);
    }
}
