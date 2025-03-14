

/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 6
 * Ivana Figueroa - 24785
 * 
 * Clase Pokemon
 * representa un Pokemon con sus atributos.
 * 
 */

public class Pokemon {

private String nombreP;
private int numPokedex;
private String tip1;
private String tip2;
private String clasificacion;
private double altura;
private double peso;
private String habilidades;
private int generacion;
private String legendario;


    /**
     * Constructor de la clase Pokemon.
     *
     * @param nombreP       El nombre del pokemon.
     * @param numPokedex    El numero en la pokedex.
     * @param tip1          El tipo primario del pokemon.
     * @param tip2          El tipo secundario del pokemon.
     * @param clasificacion La clasificacion del pokemon.
     * @param altura        La altura del pokemon en metros.
     * @param peso          El peso del pokemon en kilogramos.
     * @param habilidades   Las habilidades del okemon.
     * @param generacion    La generacion a la que pertenece el pokemon.
     * @param legendario    Indica si el Ppokemon es legendario ("Si" o "No").
     */
    public Pokemon(String nombreP, int numPokedex, String tip1, String tip2, String clasificacion, double altura, double peso, String habilidades, int generacion, String legendario ){
        this.nombreP = nombreP;
        this.numPokedex = numPokedex;
        this.tip1 = tip1;
        this.tip2 = tip2;
        this.clasificacion = clasificacion;
        this.altura = altura;
        this.peso = peso;
        this.habilidades = habilidades;
        this.generacion = generacion;
        this.legendario = legendario;

    }
    //Getters
    public String getNombre() {
        return nombreP;
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public String getTip1() {
        return tip1;
    }

    public String getTip2() {
        return tip2;
    }

    public String getClasificacion(){
        return clasificacion;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public int getGeneracion() {
        return generacion;
    }

    public String isLegendario() {
        return legendario;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreP +" --" + " Num Pokedex: " + numPokedex + " --" +"  Tipo 1: " + tip1 + " --" +" Tipo 2: " + tip2 + " --" +" Clasificacion: " + clasificacion + " --" +" Altura: " + altura + "m" + " --" +" Peso: " + peso + "Kg" + " --" +" Habilidades: " + habilidades + " --" +" Generacion: " + generacion + " --" +" Legendario: " + legendario + " \n" ;
    }


}
