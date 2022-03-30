package LaVraieRecette;


import java.util.ArrayList;

public class Ingredients {

    String nom;
    double quantite;
    String type;
//
//constructeur
    public Ingredients(String nom, double quantite, String type){
        this.nom=nom;
       this.quantite=quantite;
        this.type=type;
    }


// get pour le nom
    public String getNom(){
        return nom;
    }
//get pour la quantité
    public double getQuantite(){
        return quantite;
    }

    //get pour le type
    public String getType(){
        return type;
    }
    @Override
    public String toString(){

       // return " le nom de l'ingredient "+nom + "la quantité"+quantite+ ""+type;
        return nom;
    }


    public static void main(String[] args) {
        Ingredients sucreRoux =new Ingredients("Sucre roux", 80,"g");
        Ingredients vanille =new Ingredients("Vanille ", 1, "sachet");
        Ingredients spéculoos =new Ingredients("Spéculoos ", 300,"g");
        Ingredients cacao =new Ingredients("cacao ", 30, "g");
        Ingredients mascarpone =new Ingredients("mascarpone ", 250, "g");
        Ingredients oeufs =new Ingredients("oeufs ", 3,"");
        Ingredients café =new Ingredients("café ", 2, "tasses");

        ArrayList<Ingredients> ingr = new ArrayList<>();
        ingr.add(sucreRoux);
        ingr.add(vanille);
        ingr.add(spéculoos);
        ingr.add(cacao);
        ingr.add(mascarpone);
        ingr.add(oeufs);
        ingr.add(café);

        for ( Ingredients i : ingr){
            System.out.println(i.getNom()+""+i.getQuantite()+""+i.getType());
        }


        System.out.println(vanille.getNom()+""+vanille.getQuantite()+""+ vanille.getType());



    }





}