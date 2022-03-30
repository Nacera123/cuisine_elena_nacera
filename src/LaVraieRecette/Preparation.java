package LaVraieRecette;

import java.util.Arrays;

public class Preparation {

    private String [] etape;
    private int tempsDePreparation;
    private String temps;

    //constructeur
    public Preparation( String[] etape, int tempsDePreparation, String temps){

        this.etape = etape;
        this.tempsDePreparation = tempsDePreparation;
        this.temps = temps;
    }


    // get pour l'etape
    public String [] getEtape(){
        return etape;
    }

    // get pour le temps de preparation
    public int getTempsDePreparation(){
        return tempsDePreparation;
    }

    public java.lang.String getTemps() {
        return temps;
    }

    private String MyMethod(String [] arr) {
        String output = "";
        for (String x : arr) {
            output =  output + x +  "\n";
        }
        return output;
    }

    @Override
    public String toString() {
        return "Preparation{" +
                "etape=" + MyMethod(etape) +
                ", tempsDePreparation=" + tempsDePreparation +
                "temps='" + temps + '\'' +
                '}';
    }

    public static void main(String[] args) {
       // String [] etape = new String[2];
       // String [] etape = {"Faire un ruban avec les jaunes d'oeufs, le sucre et le sucre vanillé.","Y ajouter le mascarpone."};
       // Preparation tiramisu = new Preparation(etape,25 , "min");
       // System.out.println(tiramisu);


    }
}
