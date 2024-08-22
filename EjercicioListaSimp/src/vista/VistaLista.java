package vista;

import modelo.*;

public class VistaLista {

    public void mostrarLista(Nodo cabeza) {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.println(temp.getDato() + "->");
            temp = temp.getSiguiente();

        }
        System.out.println("null");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

}
