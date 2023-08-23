package com.example.funciones;

public class Funciones {
    public static void main(String[] args) {
        // funcion sin parametros y sin tipo de retorno
        showMenu();

        // funcion sin parametros y con tipo de retorno
        System.out.println(getMenu());

        //funcion con parametros y sin tipo de retorno
        imprimirSaludo("antonio");

        String nombre = "Jose";
        String apellido = "Bolivar";

        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);

        int resultado = suma (50, 200);
        System.out.println(resultado);

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

    //funcion con parametros y sin tipo de retorno
    static void imprimirSaludo(String nombre) {
        System.out.println("hola mi nombre es " + nombre);
    }

    //funcion con varios parametros y con tipos de retorno
    static String obtenerSaludo(String nombre, String apellido) {
        return "Buenos dias soy " +  nombre + " " + apellido;
    }
    private static int suma(int i, int i1) {
        return  i + i1;
    }

}
