package com.umb.nietop.calculadora;

public class OperacionDivision implements Operacion {

    @Override
    public float realizarOperacion(float numeroA, float numeroB) throws ExcepcionDivisionCero {

        if (numeroB == 0 ) {
            throw new ExcepcionDivisionCero();
        }
        return numeroA / numeroB;
    }
}
