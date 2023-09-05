package com.example.tiposdedatosavanzados;

import java.util.Locale;

public class TiposDeDatosAvanzados {
    public static void main(String[] args) {
        // Los tipos de datos complejos se conforman,
        // con los tipos de datos primivos.

        // Si declaramos una variable con var, sera el compilador, el que asigne
        // el tipo de dato de la misma.

        //1. String
        String cadena = "Mensaje de texto";

        int cadenaLen = cadena.length();
        String cadenaMinus = cadena.toLowerCase();
        String cadenaMayu = cadena.toUpperCase(); 




        System.out.println(cadenaMayu);
    }
}
