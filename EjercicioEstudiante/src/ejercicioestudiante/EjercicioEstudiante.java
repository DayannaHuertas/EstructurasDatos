package ejercicioestudiante;

public class EjercicioEstudiante {

    public static void main(String[] args) {

        Estudiante[] estudiante = {
            new Estudiante("Jahaira", "Huertas", "sistemas", 20),
            new Estudiante("Dayanna", "Manzano", "medicina", 21),
            new Estudiante("Alejandro", "Huertas", "electronica", 17),
        
        };
        imprimir(estudiante);
    
    }
    
    

    public static void imprimir(Estudiante[] estudiante) {
        for (Estudiante estudiant : estudiante) {
            System.out.println(estudiante);
        }
    }
}
