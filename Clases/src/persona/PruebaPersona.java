package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y Objetos Persona ***");
        System.out.println("Variable estatica: " + Persona.getContadorPersonas());
        var objeto1 = new Persona("Layla", "Acosta");
        System.out.println(objeto1); //automaticamente se llama tosString
        System.out.println("Variable estatica: " + Persona.getContadorPersonas());
//        // Segundo objeto
        var objeto2 = new Persona("Ian", "Gomez");
        System.out.println(objeto2);
        System.out.println("Variables estatica: " + Persona.getContadorPersonas());

    }
}
