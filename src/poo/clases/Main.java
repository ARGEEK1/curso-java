package poo.clases;

import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {

        //1. clases y objetos
        //Clase indentificador = new Clase() (metodo constructor)
        //crear un objeto utilizando el constructor vacio
        Vehiculo toyotaPrius = new Vehiculo();

        //crear un objeto utilizando el constructor con parametros

        Motor motorGTI = new Motor("Gti", 190, 459.0, 8);

        Vehiculo fordMondeo = new Vehiculo("ford","mondeo", 2.2, 2010, false, motorGTI);

        fordMondeo.acelerar(50);
        fordMondeo.acelerar(100);

        System.out.println(fordMondeo.motor.modelo);
        System.out.println(fordMondeo);

        //2.  herencia
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "kawasaki";
        kawasakiNinja.baul = true;

        //3. polimorfismo
        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(10);

        vehiculo = new Coche();

        vehiculo = new Camion();

    }
}
