package com.example.estructurascontrol.repeticion;

public class For {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("nº " + i);
        }

        String[] nombres = {"jose", "pepe", "juan", "maria", "josefa", "petra"};

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        //int[] valores = new int[6]; se instancia un array de numeros, de 6 posiciones.
        int[] numeros = {1, 7, 3, 4, 8, 6, 20, 8};
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println(suma);
    }
}
