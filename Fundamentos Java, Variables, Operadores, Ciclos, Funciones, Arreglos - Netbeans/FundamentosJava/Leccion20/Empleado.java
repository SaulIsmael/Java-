package sobrecargaconstructores;

public class Empleado extends Persona {

    private double sueldo;
    
    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad); //Super debe ser la primera linea
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
     @Override
    public String toString() {
        //Primero mandamos a llamar el método toString de la clase Persona
        //para que podamos observar los valores de la clase Padre, 
        //y despues imprimimos los valores de la clase hija
        return super.toString() + " Empleado{sueldo=" + sueldo + "}";
    }
}
