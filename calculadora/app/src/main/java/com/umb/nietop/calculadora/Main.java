package com.umb.nietop.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main extends AppCompatActivity {

    private EditText display;
    private float numeroA = 0, numeroB = 0;
    private boolean primerNumeroLeido = false;
    private Operacion operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);
    }

    public void presionaBoton(View view) {
        Button botonPresionado = (Button)view;
        String texto = botonPresionado.getText().toString();


        String valorActual = display.getText().toString().charAt(0) == '0' || primerNumeroLeido ? texto : display.getText().toString().concat(texto);
        if(primerNumeroLeido) {
            primerNumeroLeido = false;
        }

        display.setText(valorActual);
    }

    public void presionarAccion(View view) {
        Button botonPresionado = (Button)view;
        String accion = botonPresionado.getText().toString();

        if(Acciones.LIMPIAR.equals(accion)) {
            display.setText("0");
            numeroA = 0;
            numeroB = 0;
            return;
        }

        if(!primerNumeroLeido && Acciones.isOperacion(accion)) {
            operacion = OperacionFactory.crearOperacion(accion);
            numeroA = Float.parseFloat(display.getText().toString());
            primerNumeroLeido = true;
            return;
        }

        if(Acciones.RESULTADO.equals(accion)) {
            primerNumeroLeido = false;
            numeroB = Float.parseFloat(display.getText().toString());

            try {
                String resultado = String.valueOf(operacion.realizarOperacion(numeroA, numeroB));
                resultado  = resultado.replaceAll("\\.0*$", "");
                display.setText(String.valueOf(resultado));
            } catch (ExcepcionDivisionCero e) {
                display.setText(e.getMessage());
            }
            return;
        }

    }

}
