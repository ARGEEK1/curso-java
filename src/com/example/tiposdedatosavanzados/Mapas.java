package com.example.tiposdedatosavanzados;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        //Un mapa recibe muchos nombre; los doa más comunes son
        //mapas y array asociativo
        //un mapa es una especie de diccionario, donte tenemis una clave
        // y un valor. Ese valor podria ser otro map, bigdecimal, string, array, etc.
        //La forma más primitiva del mapa es el HashMap.
        HashMap<String, Integer> map = new HashMap<>();
        //Este es un map donde las claves seran cadenas de texto y el valor numeros enteros.
        //En los HashMap no se puede tener claves duplicadas. Porque el valor se sobreescribe.
        map.put("clave1", 10);
        map.put("clave2", 20);
        map.put("clave3", 30);
        map.put("clave4", 40);

        System.out.println(map);
        //sutituir valore:

        map.put("clave1", 90);
        map.replace("clave1", 100);// la clave tiene que excistir.
        map.remove("clave1");

        for (Map.Entry<String, Integer> elemento : map.entrySet()) {
            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("Elemento valor es: " + elemento.getValue());
        }



    }
}
