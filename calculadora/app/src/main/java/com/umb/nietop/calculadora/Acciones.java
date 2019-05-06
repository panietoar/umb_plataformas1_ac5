package com.umb.nietop.calculadora;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Acciones {

    public static final String LIMPIAR = "AC";
    public static final String DIVISION = "÷";
    public static final String PRODUCTO = "x";
    public static final String RESTA = "-";
    public static final String SUMA = "+";
    public static final String RESULTADO = "=";

    public static final List<String> OPERACIONES = Arrays.asList(DIVISION, PRODUCTO, RESTA, SUMA);

    public static boolean isOperacion(String tipo) {
        return OPERACIONES.contains(tipo);
    }

}
