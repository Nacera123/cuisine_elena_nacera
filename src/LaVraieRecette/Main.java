package LaVraieRecette;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Give values for ingredients
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

        // Give values to preparation
        String [] etape = {"1. Faire un ruban avec les jaunes d'oeufs, le sucre et le sucre vanillé.","2. Y ajouter le mascarpone.",
        "3. Battre les blancs en neige, les incorporer délicatement au mélange.", "4. Ajouter l'amaretto au café noir.",
        "5. Monter le gâteau: tremper, au fur et à mesure, les speculoos dans le café ",
        "6. Dans un plat, mettre une couche de biscuits, ensuite une couche de crème au mascarpone. ",
        "7. Ensuite une autre couche de biscuits, et terminer par une couche de crème.",
        "8. Saupoudrer de cacao, couvrir d'un film plastique et mettre au réfrigérateur quelques heures."};
        Preparation preparation = new Preparation(etape,25 , "min");

        //  Give values to ustensil
        String [] ustensil_tiramisu = {"1 saladier", "1 fouet", "1 réfrigérateur","1 plat à gratirn", "1 robot pâtissier", "1 balance de cuisine"};
        Ustensil ustensil = new Ustensil(ustensil_tiramisu);

        //  Give image
        Images im = new Images();

        // give all values at recipe
        Plat tiramisu = new Plat("Tiramisu", 4, 30, "min", "facile", 4.5,
                "été", "Italy", 15, "Vegeterien", "Dessert", ustensil, ingr, preparation, im );

        // print plat
        System.out.println(tiramisu);



    }
}
