
/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 6
 * Ivana Figueroa - 24785
 * 
 * Clase FactoryMap
 * implementa el patron factory para crear instancias de Map.
 */

import java.util.*;


public class FactoryMap {


    /**
     * Crea una instancia de Map segun la opcion seleccionada.
     *
     * @param option La opcion seleccionada por el usuario (1: HashMap, 2: TreeMap, 3: LinkedHashMap).
     * @return Una instancia de Map.
     * @throws IllegalArgumentException Si la opcio seleccionada no es válida.
     */
    public static Map<String, Pokemon> crearMap(int opcion) {
        switch (opcion){
            case 1:
            return new HashMap<>();
            case 2:
            return new LinkedHashMap<>();
            case 3:
            return new TreeMap<>();
            default:
            throw new IllegalArgumentException("Opcion invalida");
        }
    }
    
    
}
