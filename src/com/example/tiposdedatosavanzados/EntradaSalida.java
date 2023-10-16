package com.example.tiposdedatosavanzados;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class EntradaSalida {
    public static void main(String[] args) {
        try {
            InputStream fichero = new FileInputStream("/etc/passwd"); //Este metodo es para leer ficheros

            //byte[] datos;//el FileImputStream me devuele una secuencia de Bytes, por lo tanto, hay que guardarlo en una vadiable de tipo de datos acorde, y las secuencias son arrays
            int dato;
            try {
                dato = fichero.read();
                while (dato != -1) { // leer mientras.
                    System.out.print((char) dato);
                    dato = fichero.read();
                }

                //for (byte dato : datos) {
                //System.out.print((char) dato);// se forza el tipo de datos, porque los bytes son numeros.
                //}
            } catch (IOException e) {
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("El programa da Error: " + e.getMessage());
        }

    }
}
