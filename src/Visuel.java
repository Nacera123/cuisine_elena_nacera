import javafx.application.Application;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import javafx.stage.Stage;




public class Visuel extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage window) throws Exception {

        // le titre du site
        Label titre= new Label("La Vraie Recette");
        //le font du titre du site

        Font fontTitre = Font.font("Times New Roman", FontWeight.BOLD, 40);
        titre.setFont(fontTitre);

        titre.setTextFill(Color.rgb(176,224,230));
        titre.setTranslateX(400);
        titre.setTranslateY(20);

        // Bouton et son style
        Button rechercher= new Button("Affiner ma recherche");
        rechercher.setTranslateY(430);
        rechercher.setTranslateX(420);
        rechercher.setStyle("-fx-background-color: #87CEEB; ");

        // rendre mon bouton opperationnel
        rechercher.setOnAction(value ->  {
            rechercher.setText("Clicked!");
        });



        //pour l'image en arriere plan
        Image background = new Image( "photo.png");
        ImageView backgroundView = new ImageView(background);

        //les checkbox pour les ingredients
        CheckBox carotte = new CheckBox( "carotte" );
        CheckBox patate = new CheckBox( "pomme de terre" );
        CheckBox tomate = new CheckBox( "tomate" );

        //les checkbox pour les type de plat
        CheckBox petitDej = new CheckBox( "Petit Dejeuner" );
        CheckBox dejeuner= new CheckBox( "Dejeuner" );
        CheckBox diner = new CheckBox( "Diner" );

        //les checkbox pour le regime alimentaire
        CheckBox vegetarien = new CheckBox( "Vegetarien" );
        CheckBox vegan = new CheckBox( "Vegan" );
        CheckBox carnivore = new CheckBox( "Carnivore" );

        // le font pour les intitules des checkbox
        Font intituleCheckBox= Font.font( "Times New Roman", FontWeight.BOLD, 15);

        // le titre pour la partie regime alimentaire
        Label regimeAlimentaire= new Label("Par Regime Alimentaire");
        regimeAlimentaire.setFont(intituleCheckBox);


        // le titre pour la partie type de plat(petit dejeuner, diner, dejeuner)
        Label typePlat= new Label("Par Type De Plat");
        typePlat.setFont(intituleCheckBox);

        // le titre pour la partie Ingredient
        Label lesIngredient = new Label("Par Ingredients");
        lesIngredient.setFont(intituleCheckBox);

        // les Vbox qui vont contenir les checkbox
        //Vbox1
        VBox lesCheck =new VBox();

        lesCheck.setPrefSize(200,50);
        //Vbox2
        VBox lesCheck1 = new VBox();

        lesCheck1.setPrefSize(200,50);
        //Vbox2
        VBox lesCheck2 =new VBox();

        lesCheck2.setPrefSize(200,50);



        // Inserer les titre et les chckbox dans chacune des Vbox
        //Insertion pour la Vbox1
        lesCheck.getChildren().addAll(regimeAlimentaire, vegan,vegetarien,carnivore);
        lesCheck.setSpacing(30); //espace entre tous les element

        //Insertion pour la Vbox2
        lesCheck1.getChildren().addAll(typePlat, petitDej,dejeuner,diner);
        lesCheck1.setSpacing(30);

        //Insertion pour la Vbox3
        lesCheck2.getChildren().addAll(lesIngredient, carotte,patate,tomate);
        lesCheck2.setSpacing(30);



        // la hbox qui contient toutes les Vbox et son style
        HBox divConteneur=new HBox();
        divConteneur.getChildren().addAll(lesCheck, lesCheck1, lesCheck2);
        divConteneur.setSpacing(100);
        divConteneur.setTranslateY(100);

        divConteneur.setLayoutX(100);
        divConteneur.setLayoutY(100);
        divConteneur.setPrefSize(800,200);
        divConteneur.setStyle("-fx-background-color:#DCDCDC;");

        // Mon root
        Group root1 =new Group();
        root1.setLayoutX(0);
        root1.setLayoutY(0);


        root1.getChildren().addAll(backgroundView,titre, divConteneur, rechercher);


        //La scene
        Scene checkScene = new Scene(root1);

        // le stage et ses dimensions
        window.setScene(checkScene);
        window.setWidth(1100);
        window.setHeight(650);
        window.setTitle("checkbox");
        window.show();
    }
}
