package actividadautomovil;

public class ActividadAutomovil {

    public static void main(String[] args) {
        //metodos clase automovil
        Automovil miCoche = new Automovil("Toyota", "rojo", "DDF-608");
        miCoche.encender();
        miCoche.frenar();
        miCoche.acelerar();
        miCoche.apagar();

    }

}
