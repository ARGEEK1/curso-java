package com.example.tiposdedatosavanzados;

import java.sql.Array;
import java.util.Arrays;
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

        //2. Arrays
        // una variable que contiene muntiple valores consecutivos del mismo tipo.
        int arrayUno[] = new int[5];
        // Esta forma no la vamos a utilizar nunca, salvo cuando no sabemos que valores
        // vamos a tener en nuetro array. ( cunado se rrellena con parametros, o desde la entrada).
        arrayUno[0] = 4;
        arrayUno[1] = 7;
        arrayUno[2] = 3;
        arrayUno[3] = 6;
        arrayUno[4] = 1;
        for (int i : arrayUno) {
            System.out.println(i);
        }

        // Cuando si lo sabemos
        int arrayDos[] = {1, 2, 3, 4, 5, 6};
        String nombres[] = {
                "Jose",
                "Martin",
                "Juan",
        };
        System.out.println(nombres.length);//A de los String .length no es un metodo, si no una
        // propieda, por eso se coloca sin el llamado().
        for (String i : nombres) {
            System.out.println(i);
        }
        // si ya tenemos un array declarado y de forma implicita o explicita
        // le decimos que vamos a tener 4 elementos por ejemplo, despues no puedes añadir
        // 5to elememto.

        //Array bidimencionales
        //1er elemmento el numero de filas, el 2do numero de columnas.
        // los 2d se utilizan para asociaciones y los 3d para matrices matemáticas.
        int arrayBidi[][] = new int[2][4];

        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;

        arrayBidi[1][0] = 10;
        arrayBidi[1][1] = 20;
        arrayBidi[1][2] = 30;
        arrayBidi[1][3] = 40;

        for (int i = 0; i < arrayBidi.length; i++) {
            System.out.println("estoy en la fila = " + i);
            for (int j = 0; j < arrayBidi[i].length; j++) {
                System.out.println(arrayBidi[i][j]);
            }
        }

        // Cuando si lo sabemos sus valores
        // 2 filas X 4 columnas
        int arrayBidiDos[][] = {
                {1, 3, 3, 4},
                {10, 20, 30, 40}
        };
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
