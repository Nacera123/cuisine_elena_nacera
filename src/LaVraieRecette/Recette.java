package LaVraieRecette;

import java.sql.Time;

public class Recette {

    //mes proprietes
    private String nom;
    private Time tempsDeCuisson;

    //mon constructeur
    public Recette (String nom, Time tempsDeCuisson){
        this.nom=nom;
        this.tempsDeCuisson=tempsDeCuisson;
    }

    //geteur du nom

    public String getNom(){
        return nom;
    }

    //geteur du tempsDeCuisson;
    public Time getTempsDeCuisson(){
        return tempsDeCuisson;
    }

    //afficher le nom de ma recette
    public void AfficherRecette(){

    }

}
