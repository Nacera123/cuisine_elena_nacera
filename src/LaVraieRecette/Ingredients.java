package LaVraieRecette;


import java.util.ArrayList;

public class Ingredients {

    String nom;
    double quantite;
    String type;

    //constructeur
    public Ingredients(String nom, double quantite, String type) {
        this.nom = nom;
        this.quantite = quantite;
        this.type = type;
    }


    // get pour le nom
    public String getNom() {
        return nom;
    }

    //get pour la quantité
    public double getQuantite() {
        return quantite;
    }

    //get pour le type
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "\n" + nom + "la quantité " + quantite + " " + type;
    }
}
