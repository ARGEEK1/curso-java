package com.example;

public class Funciones {
    public static void main(String[] args) {
        // funcion sin parametros y sin tipo de retorno
        showMenu();

        // funcion sin parametros y cin tipo de retorno
        System.out.println(getMenu());
    }

    /**
     * void indica que no devuelve nada
     */
    static void showMenu() {
        System.out.println("Bienvenidos al E-comence de zapatillas");
        System.out.println("1- ver zapatillas");
        System.out.println("2- comprar zapatillas");
        System.out.println("salir");
    }

    static String getMenu() {
        return "Bienvenidos al E-comence de zapatillas: \n 1- ver zapatillas \n 2- comprar zapatillas \n salir";
    }

}
