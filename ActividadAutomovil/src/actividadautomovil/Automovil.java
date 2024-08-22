package actividadautomovil;

public class Automovil {
//Atributos

    private String marca;
    private String color;
    private String placa;
    private boolean enMarcha;

// constructor
    public Automovil(String marca, String color, String placa) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.enMarcha = false;//El coche comienza apagado

    }

    //Metodos 
    public void acelerar() {
        if (enMarcha) {
            System.out.println("El coche" + marca + "esta acelerando");

        } else {
            System.out.println("Primero enciende el coche");

        }

    }

    public void frenar() {
        if (enMarcha) {
            System.out.println("El coche" + marca + "esta frenando");

        } else {
            System.out.println("El coche esta apagado no se puede frenar");
        }
    }

    public void encender() {
        enMarcha = true;
        System.out.println("El coche" + marca + "se ha encendido");
    }

    public void apagar() {
        enMarcha = false;
        System.out.println("El coche" + marca + "se ha apagado");
    }

}
