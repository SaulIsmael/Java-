package ejemplopalabrafinal;

//Clase marcada como final
public final class ClaseFinal {
    
    //Variables marcadas como finales
    public static final int varPrimitivo = 10;
    
    public static final Persona persona = new Persona();     

    //Metodo final, estudiaremos el tema de sobreescritura en otra leccion
    public final void metodoFinal(){
    }      
}

//Marca error: No se puede heredad de una clase final
//class ClaseHija extends ClaseFinal{
//}