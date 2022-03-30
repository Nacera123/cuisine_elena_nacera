package LaVraieRecette;

import java.util.ArrayList;

public class Main {

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

        String [] etape = {"Faire un ruban avec les jaunes d'oeufs, le sucre et le sucre vanillé.","Y ajouter le mascarpone."};
        Preparation preparation = new Preparation(etape,25 , "min");


        Plat tiramisu = new Plat("tiramisu", 30, "min", 4, "facile", 4.5,
                "été", "Italy", 15, "vegeterien", ingr, preparation);

        System.out.println(tiramisu);



    }
}
