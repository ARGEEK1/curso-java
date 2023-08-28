package com.example.estructurascontrol.condicionales;

public class IfElseIf {
    public static void main(String[] args) {

        String dia = "diaNostro";
        //Para conparar String en java se utiliza un metodo, para los numeros si se utiliza el ==.
        boolean resultado = dia.equals("Miercoles");

        if (dia.equals("Lunes")) {
            System.out.println("Animo con la semana");

        } else if (dia.equals("Martes")) {
            System.out.println("Martes con M");

        } else if (dia.equals("Miercoles")) {
            System.out.println("Hoy es Miercoles");

        } else if (dia.equals("Jueves")) {
            System.out.println("Vamos que ya es Jueves");

        } else if (dia.equals("Viernes")) {
            System.out.println("Es Vienes");

        } else if (dia.equals("Sabado")) {
            System.out.println("Hoy es Sabado");

        } else if (dia.equals("Domingo")) {
            System.out.println("Hoy es Domigo");

        } else {
            System.out.println("éste no es un dia");
        }
    }
}
