import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Map<String, Pokemon> pokemonData = DocumentController.cargarDatos("PokemonData.csv") ;
        ControlPokemon collection = new ControlPokemon(pokemonData);

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

            System.out.println("\n1. Guardar un Pokemon en la coleccion personal");
            System.out.println("2. Buscar un Pokemon en la data");
            System.out.println("3. Buscar un pokemon por tipo 1 en coleccion personal");
            System.out.println("4. Mostrar pokemon por tipo 1 en la Data");
            System.out.println("5. Buscar Pokemones por habilidad en la Data");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){

                case 1: 
                System.out.println("\n1. Guardar Pokemon\n");
                System.out.println("Seleccione la implementación de Map:");
                System.out.println("1. HashMap");
                System.out.println("2. TreeMap");
                System.out.println("3. LinkedHashMap\n");
                int mapOption = scanner.nextInt();
                scanner.nextLine(); 
                collection.selecImplementacion(mapOption);

                
                System.out.println("Ingrese el nombre del Pokemon que desea agregar:");
                String pokemonName = scanner.nextLine().trim();
                collection.agregarCollection(pokemonName);
                break;
                
                case 2: 
                System.out.println("Buscar un Pokemon");
                    System.out.println("Ingrese el nombre del pokemon que busca: ");
                    String buscarNombre = scanner.nextLine().trim();

                    
                    Pokemon pokemonEncontrado = pokemonData.get(buscarNombre.toLowerCase());

                    if (pokemonEncontrado != null) {
                        System.out.println("Datos de el Pokemon:");
                        System.out.println(pokemonEncontrado);
                    } else {
                        System.out.println("No se encontro el Pokemon en la Data.");
                    }
                    break;


                  
                case 3: 
                System.out.println("Mostrar pokemones de coleccion por tipo 1");
                collection.coleccionPorTipo1();
                break;
                
                

                case 4: 
                collection.dataPorTipo1();
                break;

                case 5: 
                System.out.println("Ingrese la habilidad que desea buscar:");
                String habilidad = scanner.nextLine().trim();
                collection.buscarHabilidad(habilidad);
                break;
               

                case 6:
                System.out.println("Hasta Pronto ");
                scanner.close();
                return;

                
                    
            }
        }
    }
}


