
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
