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

        Vehiculo fordMondeo = new Vehiculo("ford", "mondeo", 2.2, 2010, false, motorGTI);

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

        //4. clases abstractas: no se pueden instancias, solo se instancian las clases hijas.
        // se se utiliza la palabra reservada "abstract".
        // Ejemplo la clases vehiculo, se crea para reutilizar codigo, en sus clases hijas,
        // moto, carro, camion y no queremos un vehiculo solo que no nos dice nada, si no que queremos que
        // sea de un tipo determinado, entonces hacemos la clase vehiculo abstracta y solo se podran
        //instanciar sus clases hijas (coche,motocicleta y camion).

        //5. El modificador static, quiere decir que ese metodo pertenece solo a la clase que lo contiene
        // y no a los objetos de la misma, ose a sus instancias. Y eso me permite acceder
        // a ese atributo o metodo, sin necesidad  de crear objetos... podemos queres que sea static,
        // cuando creamos constantes y no queremos crear un objeto para acceder a los valores de las mismas.

        //6. Programacion Generica: Cuando creamos clases y funciones que nos permitan trabajar con varios tipos
        // de datos a la vez. la poo lo que busca es emular la realidad mediante objetos, pero en el codigo fuente.

    }
}
