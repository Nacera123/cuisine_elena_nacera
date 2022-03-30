package LaVraieRecette;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;


public class Plat {

    //mes proprietes
    private String nom;
    private List<String> ingr;
    private int nPersonne;
    private int tempsDeCuisson;
    private int niveau;
    private int evaluation;
    private String season;

    public Plat(String nom, List<String> ingr, int tempsDeCuisson, int nPersonne, int niveau, int evaluation, String season){
        this.nom=nom;
        this.ingr = ingr;
        this.tempsDeCuisson= tempsDeCuisson;
        this.nPersonne =nPersonne;
        this.niveau = niveau;
        this.evaluation = evaluation;
        this.season = season;

    }

    //geteur des valeurs;
    public String getNom(){
        return this.nom;
    }

    public List<String> getIngr() {
        return this.ingr;
    }

    public int getnPersonne(){
        return this.nPersonne;
    }

    public int getNiveau(){
        return this.niveau;
    }

    public int getEvaluation(){
        return this.evaluation;
    }

    public String getSeason(){
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

    public void setNiveau(int niveau) {
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
                "nom='" + nom + '\'' +
                ", ingr=" + ingr +
                ", nPersonne=" + nPersonne +
                ", tempsDeCuisson=" + tempsDeCuisson +
                ", niveau=" + niveau +
                ", evaluation=" + evaluation +
                ", season='" + season + '\'' +
                '}';
    }
  }