package poo.clases;

public class Main {
    public static void main(String[] args) {

        //Clase indentificador = new Clase() (metodo constructor)

        //crear un objeto utilizando el constructor vacio
        Vehiculo toyotaPrius = new Vehiculo();

        //crear un objeto utilizando el constructor con parametros
        Vehiculo fordMondeo = new Vehiculo("ford","mondeo", 2.2, 2010, false);

        fordMondeo.acelerar(50);
        fordMondeo.acelerar(100);
        System.out.println(fordMondeo);


    }
}
