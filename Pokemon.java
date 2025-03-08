import java.util.List;

public class Pokemon {

private String nombre;
private int numPokedex;
private String tip1;
private String tip2;
private String clasificacion;
private double altura;
private double peso;
private List<String> habilidades;
private int generacion;
private boolean legendario;


    public Pokemon(String nombre, int numPokedex, String tip1, String tip2, String clasificacion, double altura, double peso, List<String> habilidade, int generacion, boolean legendario ){
        this.nombre = nombre;
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

    public String getNombre() {
        return nombre;
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

    public List<String> getHabilidades() {
        return habilidades;
    }

    public int getGeneracion() {
        return generacion;
    }

    public boolean isLegendario() {
        return legendario;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
        "Num Pokedex: " + numPokedex + "\n" +
        "Tipo 1: " + tip1 + "\n" +
        "Tipo 2: " + tip2 + "\n" +
        "Clasificacion: " + clasificacion + "\n" +
        "Altura: " + altura + "m" + "\n" +
        "Peso: " + peso + "Kg" + "\n" +
        "Habilidades: " + habilidades + "\n" +
        "Generacion: " + generacion + "\n" +
        "Legendario: " + legendario + "\n";
    }


}
