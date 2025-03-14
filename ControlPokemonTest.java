
/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 6
 * Ivana Figueroa - 24785
 * 
 * Clase
 * pruebas para la clase ControlPokemon. 
 */
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

public class ControlPokemonTest {

    private ControlPokemon controlPokemon;
    private Map<String, Pokemon> pokemonData;

    /**
     * Metodo que simula agregar un pokemon a la coleccion para acceder a ellos en las pruebas.
     */
    @Before
    public void inicio() {
        pokemonData = new HashMap<>();
        pokemonData.put("mr-mime", new Pokemon("Mr-mime", 122, "Psychic", "Fairy", "Barrier Pokémon", 1.3, 54.5, "Soundproof, Filter, Technician", 1, "No"));
        pokemonData.put("scyther", new Pokemon("Scyther", 123, "Bug", "Flying", "Mantis Pokémon", 1.5, 56.0, "Swarm, Technician, Steadfast", 1, "No"));
        pokemonData.put("jynx", new Pokemon("Jynx", 124, "Ice", "Psychic", "Human Shape Pokémon", 1.4, 40.6, "Oblivious, Forewarn, Dry-skin", 1, "No"));

        controlPokemon = new ControlPokemon(pokemonData);
        controlPokemon.selecImplementacion(1);
    }
    /**
     * Prueba para mostrar la coleccion de pokemon ordenada por tipo1.
     */
    @Test
    public void testColeccionPorTipo1() {
        controlPokemon.agregarCollection("Mr-mime");
        controlPokemon.agregarCollection("Scyther");
        controlPokemon.agregarCollection("Jynx");

        controlPokemon.coleccionPorTipo1();
    }
    /**
     * Prueba para buscar pokemon por habilidad.
     */
    @Test
    public void testBuscarHabilidad() {
        
        System.out.println("Buscando Pokemon con la habilidad 'Technician':");
        controlPokemon.buscarHabilidad("Technician");

        
        System.out.println("Buscando Pokémon con la habilidad 'Overgrow':");
        controlPokemon.buscarHabilidad("Overgrow");
    }

    
    
}