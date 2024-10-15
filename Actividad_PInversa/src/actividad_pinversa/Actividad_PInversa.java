package actividad_pinversa;

import controlador.Controlador_PolacaInversa;
import modelo.Operar;
import vista.Vista_PolacaInversa;

public class Actividad_PInversa {

    public static void main(String[] args) {
        Operar model = new Operar();
        Vista_PolacaInversa view = new Vista_PolacaInversa();
        Controlador_PolacaInversa ctrl = new Controlador_PolacaInversa(model, view);
        ctrl.iniciar();

    }

}
