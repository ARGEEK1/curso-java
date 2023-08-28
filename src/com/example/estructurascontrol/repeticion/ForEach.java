package com.example.estructurascontrol.repeticion;

public class ForEach {
    public static void main(String[] args) {

        String[] nombres = {"jose", "pepe", "juan", "maria", "josefa", "petra"};

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        int suma = 0;
        int[] numeros = {2, 3, 5, 9};
        for (int numero : numeros) {
            suma += numero;
        }

        System.out.println(suma);

    }
}