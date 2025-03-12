import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Map<String, Pokemon> PokemonData = DocumentController.cargarDatos("PokemonData.csv") ;

        System.out.println("                                  ,'\\\r\n" + //
                                        "    _.----.        ____         ,'  _\\   ___    ___     ____\r\n" + //
                                        "_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.\r\n" + //
                                        "\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |\r\n" + //
                                        " \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |\r\n" + //
                                        "   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |\r\n" + //
                                        "    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |\r\n" + //
                                        "     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |\r\n" + //
                                        "      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |\r\n" + //
                                        "       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |\r\n" + //
                                        "        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |\r\n" + //
                                        "                                `'                            '-._|");
       

       
        while (true){
            System.out.println("\n-------------------");
            
            System.out.println("1. Guardar un Pokemon en el mapa");
            System.out.println("2. Buscar un Pokemon en el CSV");
            System.out.println("3. Prueba map pokemonDta");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){

                case 1: 
                System.out.println("1. Guardar Pokemon");
                break;
                    
                
                case 2: 
                System.out.println("Buscar un Pokemon");
                    System.out.println("Ingrese el nombre del pokemon que busca");
                    String buscarNombre = scanner.nextLine().trim();

                    
                    Pokemon pokemonEncontrado = PokemonData.get(buscarNombre.toLowerCase());

                    if (pokemonEncontrado != null) {
                        System.out.println("Datos de el Pokemon:");
                        System.out.println(pokemonEncontrado);
                    } else {
                        System.out.println("No se encontro el Pokemon en la Data.");
                    }
                    break;


                  
                case 3: 
                System.out.println("Mostrando todos los Pokemons de la data:");
                    for (Map.Entry<String, Pokemon> entry : PokemonData.entrySet()) {
                        Pokemon pokemon = entry.getValue();
                        System.out.println(pokemon);
                        
                    }
                    break;

                case 4: 
                System.out.println("1. Mostra Pokemones por tipo 1 de Pokemon Data");
                break;

                case 5: 
                System.out.println("Buscar Pokemons por habilidades del Pokemon Data");
                break;

                case 6:
                System.out.println("Hasta Pronto ");
                scanner.close();
                return;
                    
            }
        }
    }
}


