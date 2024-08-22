package ejerciciolistasimp;

import controlador.*;
import modelo.*;
import vista.*;

public class EjercicioListaSimp {

    public static void main(String[] args) {
        ListaSimple modelo = new ListaSimple();
        VistaLista vista = new VistaLista();
        ListaControlador controlador = new ListaControlador(modelo, vista);
//insertar datos 
        controlador.agregarELemento(1);
        controlador.agregarELemento(6);
        controlador.agregarELemento(9);
        controlador.agregarELemento(25);

//mostrar lista
        vista.mostrarMensaje("Lista despues de agregar un elemento");
        controlador.mostrarLista();

//eliminar elemento
        controlador.eliminarElemento();
        controlador.eliminarElemento(); // con esto se elimina el elemento
        vista.mostrarMensaje("Lista despues de eliminar un elemento");
        controlador.mostrarLista();
    }

}
