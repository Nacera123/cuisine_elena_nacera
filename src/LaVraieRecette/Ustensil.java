package LaVraieRecette;

import java.util.Arrays;

public class Ustensil {
    private String [] ustensil;


    public Ustensil (String [] ustensil){
        this.ustensil = ustensil;
    }

    public String[] getUstensil() {
        return ustensil;
    }

    public void setUstensil(String[] ustensil) {
        this.ustensil = ustensil;
    }

    // put together all ustensil
    private String MyMethod2(String [] arr) {
        String output = "";
        for (String x : arr) {
            output =  output + x +  "\n";
        }
        return output;
    }

    @Override
    public String toString() {
        return MyMethod2(ustensil);
    }
}