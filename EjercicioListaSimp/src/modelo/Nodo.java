package modelo;

public class Nodo {

    private int dato;
    private Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;

    }

    //get and setter acceder a los datos, uno para mostrar informacion y  el otro para modificarla
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;

    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;

    }
}
