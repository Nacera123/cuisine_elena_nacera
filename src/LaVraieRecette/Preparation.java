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

    public String[] getEtape() {return etape;}

    public int getTempsDePreparation() {
        return tempsDePreparation;
    }

    public String getTemps() {
        return temps;
    }

    public void setEtape(String[] etape) {
        this.etape = etape;
    }

    public void setTempsDePreparation(int tempsDePreparation) {
        this.tempsDePreparation = tempsDePreparation;
    }

    public void setTemps(String temps) {
        this.temps = temps;
    }

    // put together all steps
    private String MyMethod(String [] arr) {
        String output = "";
        for (String x : arr) {
            output =  output + x +  "\n";
        }
        return output;
    }

    @Override
    public String toString() {
        return "Etapes : " + "\n" + MyMethod(etape) + "\n" +
                "Temps de preparation : " + tempsDePreparation +
                temps;
    }
}
