
package controlador;

import modelo.*;
import vista.*;


public class ListaControlador {
    private ListaSimple modelo;
    private VistaLista vista;
    
    public ListaControlador(ListaSimple modelo,VistaLista vista){
      this.modelo=modelo;
      this.vista=vista;
        
    }
    public void  agregarELemento(int valor){
        modelo.agregar(valor);
    }
    public void eliminarElemento(){
        modelo.eliminar();
        
    }
    public void mostrarLista(){
        vista.mostrarLista(modelo.getCabeza());
        
    }
    
}
