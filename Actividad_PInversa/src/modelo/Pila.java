package modelo;

public class Pila {

    private Nodo cima;

    public Pila() {
        this.cima = null;
    }

    public void apilar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    public int desapilar() {
        if (esVacia()) {
            throw new RuntimeException("La pila está vacía");
        }

        int dato = cima.dato;
        cima = cima.siguiente;
        return dato;
    }

    public boolean esVacia() {
        return cima == null;
    }
}
