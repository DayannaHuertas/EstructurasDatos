package actividadlistasimp;

public class ListaSimple {

    private Nodo cabeza;

    public ListaSimple() {
        this.cabeza = null;

    }

    //metodo para agregar
    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;

            }
            temp.siguiente = nuevoNodo;
        }

    }

    public void eliminar() {
        if (cabeza != null) {
            cabeza = cabeza.siguiente;
        } else {
            System.out.println("La lista esta vacia");

        }
    }

    public void mostrarLista() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.println(temp.dato + "->");
            temp = temp.siguiente;

        }
        System.out.println("null");

    }

}
