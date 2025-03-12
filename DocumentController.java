import java.io.*;
import java.util.*;


public class DocumentController{
    
    
    public static Map<String, Pokemon> cargarDatos(String filename)throws IOException{
        Map<String, Pokemon> data = new HashMap<>();
       

        try (BufferedReader reader = new BufferedReader(new FileReader("PokemonData.csv"))) {
            String line;
            reader.readLine();

            while ((line = reader.readLine()) != null) {
              
                try {
                    String[] columna = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                

                    
                    String nombreP = columna[0].trim();
                    int numPokedex = Integer.parseInt( columna[1].trim());
                    String tip1 = columna[2].trim();
                    String tip2 = columna[3].trim().isEmpty() ? null : columna[3].trim();
                    String clasificacion = columna[4].trim();
                    double altura = Double.parseDouble(columna[5].trim());
                    double peso = Double.parseDouble(columna[6].trim());
                    String habilidades = columna[7].trim();

                    if (habilidades.startsWith("\"") && habilidades.endsWith("\"")) {
                        habilidades = habilidades.substring(1, habilidades.length() - 1); 
                    }
                    int generacion = Integer.parseInt(columna[8].trim());
                    String legendario = columna[9].trim();

                    Pokemon pokemon = new Pokemon(nombreP, numPokedex, tip1, tip2, clasificacion, altura, peso, habilidades, generacion, legendario);
                    data.put(nombreP.toLowerCase(), pokemon);

                } catch (NumberFormatException e) {
                    System.out.println("Error en datos numericos: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error de lectura del CSV: " + e.getMessage());
        }

        System.out.println("Total Pokemons cargados: " + data.size());
        return data;
    }

    
}

    
  
     
         





