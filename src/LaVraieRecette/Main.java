package LaVraieRecette;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //TIRAMISU

        //Ingredients
        String[] ingredients = CSVReader_Ingredients.reader().get("Tiramisu");
        Ingredients ingredients_tiramisu = new Ingredients(ingredients);

        // Preparation
        String[] etape_tiramisu = CSVReader_Preparation.reader().get("Tiramisu");
        Preparation preparation_tiramisu = new Preparation(etape_tiramisu,25 , "min");

        //Ustensil
        String[] ustensil = CSVReader_Ustensil.reader().get("Tiramisu");
        Ustensil ustensil_tiramisu = new Ustensil(ustensil);


        // image
        Images im = new Images();

        // give all values at recipe
          Plat tiramisu = new Plat("Tiramisu", 4, 30, "min", "facile", 4.5,
         "été", "Italy", 15, "Vegeterien", "Dessert", ustensil_tiramisu, ingredients_tiramisu, preparation_tiramisu, im );

        // print plat
        System.out.println(tiramisu);





    }
}
