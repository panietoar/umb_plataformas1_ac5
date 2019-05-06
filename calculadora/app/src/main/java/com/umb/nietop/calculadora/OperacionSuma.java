package com.umb.nietop.calculadora;

public class OperacionSuma implements Operacion {

    @Override
    public float realizarOperacion(float numeroA, float numeroB) {
        return numeroA + numeroB;
    }
}
