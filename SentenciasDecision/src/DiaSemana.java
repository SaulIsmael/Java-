public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("*** Dia de la Semana con Switch ***");
        var dia = 1; // Suponiendo que 1 - Lunes, 2 - Martes, etc

        switch (dia){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Dia invalido: " + dia);

        }

    }
}
