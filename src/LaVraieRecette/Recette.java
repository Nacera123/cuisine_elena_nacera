package LaVraieRecette;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.text.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Recette extends Application {
    public static void main(String[] args) {
        launch(args);
    }
//scorllpane pour afficher ce qu'on veut
    //stroke des text en passant par le graphique context
    //textarea


    @Override
    public void start(Stage stage) throws Exception {


        //les images
        Image image1 = new Image("images/dejeuner.png");
        ImageView imageEntree = new ImageView(image1);
        imageEntree.setFitHeight(750); //DONE
        imageEntree.setFitWidth(400);

        Image circle = new Image("images/circle.png");
        ImageView Circle = new ImageView(circle);
        Circle.setFitHeight(80); //DONE
        Circle.setFitWidth(80);


        //le scrollPane pour ingredients et preparation
        ScrollPane scrollIngredient = new ScrollPane();

        Text ingredients_Côtelettes = new Text("2 c.à.s de miel toutes fleurs,"+"\n"+"\n"+
                                                "1 c.à.s de cannelle," + "\n" +"\n"+
                                                "1 c.à.c de gingembre en poudre,"+"\n"+"\n"+
                                                "1 c.à.c de gingembre en poudre,"+"\n"+"\n"+
                                                "5 clous de girofle,"+"\n"+"\n"+
                                                "1 pincée de piment d'Espelette,"+"\n"+"\n"+
                                                "2 gousses d'ail hachées,"+"\n"+"\n"+
                                                "6 côtelettes d'agneau");


        scrollIngredient.setStyle("-fx-background-color: #FFFFFF; ");
        scrollIngredient.setFitToWidth(true);
        scrollIngredient.setContent(ingredients_Côtelettes);


        scrollIngredient.setPrefWidth(300);
        scrollIngredient.setPrefHeight(400);
        scrollIngredient.setStyle("-fx-background: transparent; -fx-background-color: transparent; ");

         // preparation
        ScrollPane scrollPreparation = new ScrollPane();
        Text preparation_Côtelettes = new Text("1. Bien badigeonner les côtelettes d’agneau  "+"\n"+"\n"+
                "   avec l’huile d’olive, les herbes de provence, sel et poivre."+"\n"+"\n"+
                "2. Fondre le beurre dans une sauteuse sur un feu moyen."+"\n"+"\n"+
                "3.Ajouter l’agneau et les dents d’ail et cuire jusqu'à ce que"+"\n"+"\n"+
                "   ce que les côtelettes soient dorées des deux côtés.\n"+"\n"+
                "4.Servir immediatement.");

        scrollPreparation.setContent(preparation_Côtelettes);
        scrollPreparation.setFitToWidth(false);
        scrollPreparation.setPrefWidth(700);
        scrollPreparation.setPrefHeight(700);
        scrollPreparation.setStyle("-fx-background: transparent; -fx-background-color: transparent; ");


        // Ustensil
        ScrollPane scrollUstensil = new ScrollPane();
        Text ustensil_Côtelettes = new Text("1 cuillère en bois"+"\n"+"\n"+
                "1 fours"+"\n"+"\n"+
                "2. 1 grille."+"\n"+"\n"+
                "3.1 pinceau");

        scrollUstensil .setContent(ustensil_Côtelettes );
        scrollUstensil .setFitToWidth(false);
        scrollUstensil .setPrefWidth(700);
        scrollUstensil .setPrefHeight(700);
        scrollUstensil .setStyle("-fx-background: transparent; -fx-background-color: transparent; ");



        //les Vbox qui vont contenir le resultat
        VBox vBoximage1 =  new VBox();
        vBoximage1.setTranslateY(-10);
        vBoximage1.setTranslateX(700);
        vBoximage1.getChildren().addAll(imageEntree);

        // circle
        VBox vBoxcircle =  new VBox();
        vBoxcircle.setTranslateY(5);
        vBoxcircle.setTranslateX(10);
        vBoxcircle.getChildren().addAll(Circle);

        // create boxs for text
        //Ingredients
        VBox vBoximage2 =new VBox();
        vBoximage2.setStyle("-fx-background-color:rgba(255, 255, 128, .0); -fx-background-radius: 10;");
        vBoximage2.setTranslateY(350);
        vBoximage2.setTranslateX(10);
        vBoximage2.getChildren().add(scrollIngredient);

        //preparation
        VBox vBoximage3 =new VBox();
        vBoximage3.setStyle("-fx-background-color:rgba(255, 255, 128, .0); -fx-background-radius: 10;");
        vBoximage3.setTranslateY(350);
        vBoximage3.setTranslateX(350);
        vBoximage3.getChildren().add(scrollPreparation);

        //ustensul
        VBox vBoximage4 =new VBox();
        vBoximage4.setStyle("-fx-background-color:rgba(255, 255, 128, .0); -fx-background-radius: 10;");
        vBoximage4.setTranslateY(380);
        vBoximage4.setTranslateX(225);
        vBoximage4.getChildren().add(scrollUstensil);

        //backgroung
        Image image=new Image("images/Blue.png");
        ImageView backgroundImage= new ImageView(image);
        backgroundImage.setFitHeight(750); //DONE
        backgroundImage.setFitWidth(800);



        Label titre= new Label("Côtelettes d'agneau"); //La Vraie Recette

        //le font du titre du site
        Font fontTitre = Font.font("Playfair Display", FontWeight.BOLD, 40);
        titre.setFont(fontTitre);
        titre.setTextFill(Color.rgb(255,255,255));
        titre.setTranslateX(150);
        titre.setTranslateY(80);

        Label titre1 = new Label("Preparation: 10 min   Cuisson: 30 min   Carnivore   Dejeuner"); //
        Font sousTitre = Font.font("Playfair Display", 15);
        titre1.setFont(sousTitre);
        titre1.setTextFill(Color.rgb(255,255,255));
        titre1.setTranslateX(150);
        titre1.setTranslateY(40);
        titre1.setUnderline(true);

        Label titre2 = new Label("Facile             4 Personnes             Evaluation : 4,5             France  Hiver"); //
        titre2.setFont(sousTitre);
        titre2.setTextFill(Color.rgb(255,255,255));
        titre2.setTranslateX(50);
        titre2.setTranslateY(200);

        Label titre3 = new Label("Prix: €€");
        titre3.setFont(sousTitre);
        titre3.setTextFill(Color.rgb(255,255,255));
        titre3.setTranslateX(10);
        titre3.setTranslateY(620);

        Label titre4 = new Label("Ingrédients :                              Ustensil:                 Instruction :");
        Font Titre4 = Font.font("Playfair Display", FontWeight.BOLD, 15);
        titre4.setFont(Titre4);
        titre4.setTextFill(Color.rgb(255,255,255));
        titre4.setTranslateX(10);
        titre4.setTranslateY(300);


        //le border pane
        Group borderPane=new Group();
        borderPane.getChildren().addAll(backgroundImage, titre, titre1, titre2, titre3, titre4, vBoximage1, vBoximage2,vBoximage3, vBoximage4, vBoxcircle);

        //la scene
        Scene scene= new Scene(borderPane,1100,650);
        stage.setScene(scene);



        stage.setTitle("lavraierecette.com/resultatdemarecherche");
        //afficher le stage
        stage.show();

    }
}
