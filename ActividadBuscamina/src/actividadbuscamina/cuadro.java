package actividadbuscamina;

import javax.swing.JButton;

public class cuadro extends JButton {

    private boolean mina;

    //constructor
    public cuadro() {
        super();
        double random = Math.random();
        if (random > 0.9) {
            mina = true;

        } else {
            mina = false;
        }
    }

    // metodo
    public boolean estaMinado() {
        return mina;
    }

}
