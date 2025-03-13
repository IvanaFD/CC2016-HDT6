import java.util.*;

public class ControlPokemon {
    private Map<String, Pokemon> collection;
    private Map<String, Pokemon> pokemonData;

    public ControlPokemon(Map<String, Pokemon> pokemonData) {
        this.pokemonData = pokemonData;
    }

    public Map<String, Pokemon> getCollection() {
        return collection;
    }
    public void selecImplementacion(int opcion) {
        if (collection == null) { 
            this.collection = FactoryMap.crearMap(opcion);
            System.out.println("Implementacion de Map seleccionada: " + collection.getClass().getSimpleName());
        } else {
            System.out.println("La implementación del Map ya fue seleccionada.");
        }
    }

    
    public void agregarCollection(String pokemonName) {
        if (collection == null) {
            System.out.println("Primero seleccione una implementacion de Map.");
            return;
        }

        Pokemon pokemon = pokemonData.get(pokemonName.toLowerCase());
        if (pokemon == null) {
            System.out.println("Error: El Pokemon no existe en la data.");
        } else if (collection.containsKey(pokemonName.toLowerCase())) {
            System.out.println("Error: El Pokemon ya esta en tu colección.");
        } else {
            collection.put(pokemonName.toLowerCase(), pokemon);
            System.out.println("Pokemon agregado a la colección: " + pokemonName);
        }
    }

    public void coleccionPorTipo1() {
    if (collection == null || collection.isEmpty()) {
        System.out.println("la coleccion no tiene pokemones.");
        return;
    }

    
    List<Pokemon> listaPokemon = new ArrayList<>(collection.values());

    
    listaPokemon.sort(Comparator.comparing(Pokemon::getTip1));

   
    
    for (Pokemon pokemon : listaPokemon) {
        System.out.println("Nombre: " + pokemon.getNombre() + ", Tipo 1: " + pokemon.getTip1());
    }
}


    
}
