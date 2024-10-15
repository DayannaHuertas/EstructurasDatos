package controlador;

import modelo.Operar;
import vista.Vista_PolacaInversa;

public class Controlador_PolacaInversa {

    private Operar model;
    private Vista_PolacaInversa view;

    public Controlador_PolacaInversa(Operar model, Vista_PolacaInversa view) {
        this.model = model;
        this.view = view;

    }

    public void iniciar() {
        String expresion = view.pedirExpresion();
        int resultado = model.evaluarExpresion(expresion);
        view.mostrarMensaje("El resultado es " + resultado);
    }
}
