package LaVraieRecette;


public class Plat {

    //mes proprietes
    private String nom;
    private int nPersonne;
    private int tempsDeCuisson;
    private String temps;
    private String niveau;
    private double evaluation;
    private String season;
    private String region;
    private double prix;
    private String regimeAlimentaire;
    private String typeDePlat;
    private Ustensil ustensil;
    private Ingredients ingredients;
    private Preparation preparation;
    private Images im;



    // Constroctur
    public Plat(String nom, int nPersonne, int tempsDeCuisson, String temps, String niveau, double evaluation, String season,
                String region, double prix, String regimeAlimentaire, String typeDePlat, Ustensil ustensil, Ingredients ingredients,
                Preparation preparation, Images im ){
        this.nom=nom;
        this.tempsDeCuisson= tempsDeCuisson;
        this.temps = temps;
        this.nPersonne =nPersonne;
        this.niveau = niveau;
        this.evaluation = evaluation;
        this.season = season;
        this.region = region;
        this.prix = prix;
        this.regimeAlimentaire = regimeAlimentaire;
        this.typeDePlat = typeDePlat;
        this.ustensil = ustensil;
        this.ingredients = ingredients;
        this.preparation = preparation;


    }

    //getters
    public String getNom(){
        return this.nom;
    }
    public String getTemps() {
        return temps;
    }
    public String getTypeDePlat() {
        return typeDePlat;
    }
    public int getnPersonne(){
        return this.nPersonne;
    }
    public String getNiveau(){
        return this.niveau;
    }
    public double getEvaluation(){
        return this.evaluation;
    }
    public String getSeason(){
        return this.season;
    }
    public int getTempsDeCuisson() {
        return tempsDeCuisson;
    }
    public String getRegion() {
        return region;
    }
    public double getPrix() {
        return prix;
    }
    public String getRegimeAlimentaire() {
        return regimeAlimentaire;
    }
    public Ustensil getUstensil() {
        return ustensil;
    }
    public Ingredients getIngredients() {
        return ingredients;
    }
    public Preparation getPreparation() {
        return preparation;
    }


    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setTemps(String temps) {
        this.temps = temps;
    }
    public void setTempsDeCuisson(int tempsDeCuisson) {
        this.tempsDeCuisson = tempsDeCuisson;
    }
    public void setnPersonne(int nPersonne) {
        this.nPersonne = nPersonne;
    }
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
    public void setEvaluation(double evaluation) {
        this.evaluation = evaluation;
    }
    public void setSeason(String season) {
        this.season = season;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public void setRegimeAlimentaire(String regimeAlimentaire) {
        this.regimeAlimentaire = regimeAlimentaire;
    }
    public void setUstensil(Ustensil ustensil) {
        this.ustensil = ustensil;
    }
    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }
    public void setPreparation(Preparation preparation) {
        this.preparation = preparation;
    }
    public void setTypeDePlat(String typeDePlat) {
        this.typeDePlat = typeDePlat;
    }

    //afficher les details de la recette
    @Override
    public String toString() {
        return "Plat : " +
                nom + ", pour " +
               nPersonne +  " personnes" +
                ", Temps de cuisson : " + tempsDeCuisson +
                temps +
                ", Niveau : " + niveau +
                ", Evaluation : " + evaluation +
                ", Season : " + season  +
                ", Region : " + region  +
                ", prix : " + prix +
                ", Type : " + regimeAlimentaire +
                ", " + typeDePlat  +  "\n"+ "\n"+
                "Ustensil : " + "\n"+  ustensil  +
                "\n"+ "Ingredients : " + ingredients +
                "\n" + "\n" +preparation;
    }
}