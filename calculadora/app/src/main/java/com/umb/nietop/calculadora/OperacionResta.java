package com.umb.nietop.calculadora;

public class OperacionResta implements Operacion {
    @Override
    public float realizarOperacion(float numeroA, float numeroB) {
        return numeroA - numeroB;
    }
}
