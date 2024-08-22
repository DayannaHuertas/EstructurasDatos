package modelo;

public class ListaSimple {

    private Nodo cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }

    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;

        } else {
            Nodo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();

            }

            temp.setSiguiente(nuevoNodo);

        }
    }

    public void eliminar() {
        if (cabeza != null) {
            cabeza = cabeza.getSiguiente();
        } else {
            System.out.println("La lista esta vacia");
        }
    }

    public Nodo getCabeza() {
        return cabeza;
    }

}
