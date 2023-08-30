package com.example.estructurascontrol.repeticion;

public class While {
    public static void main(String[] args) {

        int contador = 0;

        while (contador < 10) {
            contador++;

            if (contador == 5) {
                //break;
                continue;
            }
            System.out.println(contador);
        }
    }
}
