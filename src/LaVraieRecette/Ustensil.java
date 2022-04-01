package LaVraieRecette;


public class Ustensil {
    private String [] ustensil;

    //constructor
    public Ustensil (String [] ustensil){this.ustensil = ustensil;}

    // getter for ustensil
    public String[] getUstensil() {return ustensil;}

    //setter for ustensil
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