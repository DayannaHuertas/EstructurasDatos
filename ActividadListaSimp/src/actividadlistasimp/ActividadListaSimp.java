package actividadlistasimp;

public class ActividadListaSimp {

    public static void main(String[] args) {
        //objeto de tipo lista
        ListaSimple listaSimple = new ListaSimple();
        listaSimple.agregar(2);
        listaSimple.agregar(5);
        listaSimple.agregar(10);

        System.out.println("lista despues de agregar elementos");
        listaSimple.mostrarLista();

        listaSimple.eliminar();
        System.out.println("Lista despues de eliminar elemtento");
        listaSimple.mostrarLista();

    }

}
