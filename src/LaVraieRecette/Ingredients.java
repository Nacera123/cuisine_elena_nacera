package LaVraieRecette;

import javafx.scene.Node;

import java.net.DatagramSocket;

public class Ingredients extends Node {
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

    @Override
    public Node getStyleableNode() {
        return super.getStyleableNode();
    }

    public DatagramSocket wrappingWidthProperty() {
        return null;
    }
}

