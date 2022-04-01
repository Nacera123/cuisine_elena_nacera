package LaVraieRecette;

public class Ingredients {
    private String[] ingredients;

    //contsructor
    public Ingredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    // getter
    public String[] getIngredients() {
        return ingredients;
    }

    //setter
    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    // put together all ustensil
    private String MyMethod3(String[] arr) {
        String output = "";
        for (String x : arr) {
            output = output + x + "\n";
        }
        return output;
    }

    @Override
    public String toString() {
        return MyMethod3(ingredients);
    }
}

