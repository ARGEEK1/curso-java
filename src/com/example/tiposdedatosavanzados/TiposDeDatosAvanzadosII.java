package com.example.tiposdedatosavanzados;

import java.math.BigDecimal;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Vector;

public class TiposDeDatosAvanzadosII {
    public static void main(String[] args) {
        //3. Vectores
        // son como los array a diferencia que no le damos un tamaño espesifico
        // sino que se ajstan
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        // salida [1, 2, 3] es como unarray dinamico.

        vector.remove(2); // se le pasa el index que deseas eliminar
        // salida [1, 2]

        //Tamaño y capacidad
        vector.size(); // tamaño, salida 2
        vector.capacity(); // capacidad, salida 10
        // los vectores son dinamicos, porque tinen un array de x cantidad de elementos
        // que seria la caopacidad, que a medida que se vayan agregando datos el va creciendo en su capacidad.
        // cuando se llena la capacidad del array, el se copia en un array nuevo con mas capacidad y asi ...
        // es un operacion costosa a nivel computacional.

        Vector<Integer> vector1 = new Vector<>(50, 15);//se le puede dar una capacidad inicial
        // el segundo parametro es el incremento.
        vector1.add(1);
        vector1.add(2);
        //Comparar vectores
        boolean resultado = vector.equals(vector1); //salida true, son iguales.

        // recorrelo
        for (int i : vector1) {
            System.out.println(i);
        }

        for (int i = 0; i < vector1.size(); i++) {
            System.out.println(vector1.get(i));
        }

        vector1.trimToSize();// reduce la capacidad del vector hasta lo que contiene
        //antes 50 ahora 2


        //3. Array List
        //List<String> lista = new ArrayList<String>(); //versiones previas, ahora hya que ser explicitos.
        //Un array list es la implementacion de la interfaz list. es muy similar al vector.
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("hola");
        lista.add("que");
        lista.add("tal ?");

        lista.remove(1);// lo puedes remover o con el intedex o con el contenido el contenido ("hola")

        //El vector de se aumenta por 2, osea que la doblaba
        //El array List crece en un 50% de su capacidad original.
        // SE recorren de la misma manera.

        // Utilizamos las sintaxis new, porque no se que valores tendra muy array.
        // por lo tanto no la inicializamos {"", "" ,""}
        String[] array = new String[lista.size()];

        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }

        for (String elemento : array) {
            System.out.println(elemento);
        }

        // La clase Object todo en java deriva de esta clase.
        for (Object arrayObjeto : lista.toArray()) {
            System.out.println(arrayObjeto.toString());
        }

        //Lo que requiere una alta precisión, no lo aremos con duble ni float
        //utilizaremos una clase llamada BigDecimal

        BigDecimal valorA = new BigDecimal(0.1f);
        //cuando queremos trabajr con con una variable creada como un BigDecimal
        //tenemos que trabajarla con los metodos apropiados que nos brinda la misma clase BigDecimal.

        BigDecimal valorB = new BigDecimal(4);
        //cunndo operas con los metodos de BigDecimal, los parametros que espera
        // tienen que ser bigdecimal tambien.
        System.out.println(valorA.multiply(valorB));
        System.out.println(valorA);
        System.out.println(valorA.add(valorB));





    }
}
