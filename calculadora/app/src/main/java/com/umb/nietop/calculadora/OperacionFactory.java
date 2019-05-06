package com.umb.nietop.calculadora;

public class OperacionFactory {

    public static Operacion crearOperacion(String tipo) {

        Operacion operacion = null;
        if (Acciones.PRODUCTO.equals(tipo)) {
            operacion = new  OperacionProducto();
        } else if (Acciones.DIVISION.equals(tipo)) {
            operacion = new OperacionDivision();
        } else if (Acciones.SUMA.equals(tipo)) {
            operacion = new OperacionSuma();
        } else if (Acciones.RESTA.equals(tipo)) {
            operacion = new OperacionResta();
        }

        return operacion;
    }
}
