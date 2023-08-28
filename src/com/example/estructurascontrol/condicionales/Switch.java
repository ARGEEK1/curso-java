package com.example.estructurascontrol.condicionales;

public class Switch {
    public static void main(String[] args) {

        String dia = "Miercoles";

        switch (dia) {

            case "Lunes":
                System.out.println("Animo con la semana");
                break;

            case "Martes":
                System.out.println("Hoy es Martes");
                break;

            case "Miercoles":
                System.out.println("Hoy es Miercoles");
                break;

            case "Jueves":
                System.out.println("Hoy es jueves");
                break;

            case "Viernes":
                System.out.println("Hoy es Viernes");
                break;

            case "Sabado":
                System.out.println("Hoy es Sabado");
                break;

            case "Domingo":
                System.out.println("Hoy es Domindo");
                break;

            default:
                System.out.println("éste no es un día de la semana");
        }
    }
}
