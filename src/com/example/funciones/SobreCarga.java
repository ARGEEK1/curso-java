package com.example.funciones;

//permite duplicamos un metodo (funcion), simpre y cuando tenga fiferente
// numero o tipo de parametros.
//en este caso la funcion suma.
public class SobreCarga {
    public static void main(String[] args) {

    }

    static int suma(int num1, int num2) {
        return num1 + num2;
    }

    static int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
