package com.umb.nietop.calculadora;

public class OperacionProducto implements Operacion {
    @Override
    public float realizarOperacion(float numeroA, float numeroB) throws ExcepcionDivisionCero {
        return numeroA * numeroB;
    }
}
