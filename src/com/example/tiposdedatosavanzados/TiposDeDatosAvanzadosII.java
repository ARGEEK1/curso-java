package com.example.tiposdedatosavanzados;

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




    }
}
