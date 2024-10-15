package vista;

import java.util.Scanner;

public class Vista_PolacaInversa {

    private Scanner scanner;

    public Vista_PolacaInversa() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String pedirExpresion() {
        System.out.println("Ingrese la expresion en notacion polaca inversa ejemplo 3 4 + 5 * ");
        return scanner.nextLine();
    }
}
