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
        boolean resultado = cadena.startsWith("Men");//este metodo arroja true o false y es sensible a las mayusculas.
        boolean result = cadena.endsWith("o");// evalua si termina en 'o' en este caso es verdadero.
        char letra = cadena.charAt(0);// este metodo, le pasas un indice y te da como resultado, la letra que ocupa dicha posicion.
        //Recorrer cadena
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println("Caracter actual: " + cadena.charAt(i));
        }

        System.out.println(cadenaInvertida2(cadena));
    }

    static String cadenaInvertida(String cadena) {
        String newCadena = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            newCadena += cadena.charAt(i);
        }
        return newCadena;
    }

    static String cadenaInvertida2(String cadena) {
        StringBuilder resultado = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado.append(cadena.charAt(i));
        }
        return resultado.toString();
    }

}
