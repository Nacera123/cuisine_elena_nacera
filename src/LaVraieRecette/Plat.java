package LaVraieRecette;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;


public class Plat {

    //mes proprietes
    private String nom;
    //private List<String> ingr;
    private int nPersonne;
    private int tempsDeCuisson;
    private String temps;
    private String  niveau;
    private double evaluation;
    private String season;

    public Plat(String nom,  int nPersonne,int tempsDeCuisson, String temps, String  niveau, Double evaluation, String season){
        this.nom=nom;
        this.nPersonne =nPersonne;
        this.tempsDeCuisson= tempsDeCuisson;
        this.temps=temps;
        this.niveau = niveau;
        this.evaluation = evaluation;
        this.season = season;

    }

    //geteur des valeurs;
    //get pour le nom
    public String getNom(){

        return this.nom;
    }

    //get pour le nombre de personne
    public int getnPersonne(){

        return this.nPersonne;
    }
    //get pour le temps de cuissson
    public int getTempsDeCuisson(){
        return this.tempsDeCuisson;
    }
    //get pour le temps
    public String getTemps(){
        return this.temps;
    }
    //get pour le niveau
    public String getNiveau(){
        return this.niveau;
    }

    //get  pour evaluation
    public double getEvaluation(){

        return this.evaluation;
    }
    //get pour la saison
    public String getSeason()
    {
        return this.season;
    }

  // Definir les variables

  public void setnom(String nom) {
        this.nom = nom;
    }
    public void setTempsDeCuisson(int tempsDeCuisson) {
        this.tempsDeCuisson = tempsDeCuisson;
    }
    public void setnPersonne(int nPersonne) {
        this.nPersonne = nPersonne;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }
    public void setSeason(String season) {
        this.season = season;
    }


    //afficher les details de la recette



    @Override
    public String toString() {
        return "Plat{" +
                "" + nom + '\'' +
                "nombre de personne" + nPersonne +
                ", temps De Cuisson=" + tempsDeCuisson +
                "" + temps + '\'' +
                ", niveau de difficulté" + niveau + '\'' +
                ", evaluation=" + evaluation +
                ", season='" + season + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Plat tiramisu = new Plat("tiramisu", 4, 30, "min", "facile", 4.5,"été"  );

        System.out.println(tiramisu);
    }
}