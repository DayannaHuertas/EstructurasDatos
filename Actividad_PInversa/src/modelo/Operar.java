package modelo;

public class Operar {
    private Pila pila;

    public Operar() {
        pila = new Pila();
    }
    
    public int evaluarExpresion(String esprecion) {
        String[] elementosExpresion = esprecion.split(" ");

        for (String elemento : elementosExpresion) {
            if (esOperador(elemento)) {
                int operando2 = pila.desapilar();
                int operando1 = pila.desapilar();
                int resultado = operar(operando1, operando2, elemento);
                pila.apilar(resultado);

            } else {
                pila.apilar((Integer.parseInt(elemento)));
            }
        }
        return pila.desapilar();
    }
    
    
    
    

    private boolean esOperador(String elemento){
        return elemento.equals("+") || elemento.equals("-") || elemento.equals("*") || elemento.equals("/");
    }

    private int operar(int a, int b, String operador){
        switch (operador) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("División por cero");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Operador no soportado: " + operador);
        }
    }
}



