import javafx.animation.AnimationTimer;
import javafx.application.Application;

import javafx.css.converter.FontConverter;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.image.*;

import java.awt.*;


public class Interface extends Application {
    /**
     * le stage est notre theatre c'est la premiere chose qu'on crée
     * on peut lui donner un titre
     * tout ce qui est mis a l'interieur du stage est une scene "la scene est une partie de mon application"
     * pour créer la scene, il faut créer un objet de type borderpane et lui donner un nom ici on va l'appeler root pour dire que c'est une racine c'est lui qui va contenir tous les element que je vais afficher
     * juste apres je crée ma scéne, et lui donner pour parametre le nom de mon borderpane
     * exp: Scene scene= new Scene(root); si on veut donner des dimensions a ma scene on met des virgules apres le root et on dimentionne
     * pour que la scene soit prise en compte faut la mettre a l'interieur du stage
     * pour cela on fait : stage.setScene(scene);
     */


    public static void main(String[] args) {
        launch(args);
    }

        @Override
        public void start(Stage stage) throws Exception {


            // le titre du site
            Label titre= new Label("La Vraie Recette");

            //le font du titre du site
            Font fontTitre = Font.font("Times New Roman", FontWeight.BOLD, 40);
            titre.setFont(fontTitre);

            titre.setTextFill(Color.rgb(176,224,230));
            titre.setTranslateX(400);
            titre.setTranslateY(20);

            // text menu du jour
            Label labelMenuDuJour = new Label("Menu Du Jour");
            labelMenuDuJour.setTranslateY(250);
            labelMenuDuJour.setTranslateX(500);

            //font size pour le menu du jour
            Font fontMenu = Font.font("Times New Roman", FontWeight.BOLD, 30);
            labelMenuDuJour.setFont(fontMenu);



            //la barre de recherche
            TextField textFieldnNomPlat = new TextField();
            textFieldnNomPlat.setTranslateX(50);
            textFieldnNomPlat.setTranslateY(30);

            // Bouton et son style
            Button rechercher= new Button("Recherche");
            rechercher.setTranslateY(30);
            rechercher.setTranslateX(20);
            rechercher.setStyle("-fx-background-color: #87CEEB; ");

            // rendre mon bouton opperationnel
            rechercher.setOnAction(value ->  {
                rechercher.setText("Clicked!");
            });

            //Bouton affiner ma recherche
            Button buttonAffinnerRecherche = new Button("Affiner ma recherche");
            buttonAffinnerRecherche.setTranslateY(50);
            buttonAffinnerRecherche.setTranslateX(100);
            buttonAffinnerRecherche.setStyle("-fx-background-color: #87CEEB;");

            //la hbox qui va contenir la barre de recherche + affiner ma recherche
            VBox vboxTextField = new VBox();
            vboxTextField.setPrefSize(250,110);
            vboxTextField.getChildren().addAll(textFieldnNomPlat,buttonAffinnerRecherche);

            //la hbox qui va contenir le bouton rechercher
            HBox hboxBouton = new HBox();
            hboxBouton.setPrefSize(100,110);
            hboxBouton.getChildren().add(rechercher);


            // creer une Vbox qui va contenir a droite une Hbox  avec le bouton rechercher et a gauche le TextField
            HBox hboxrecherche = new HBox();
            hboxrecherche.setPrefSize(400,110);
            hboxrecherche.setTranslateY(100);
            hboxrecherche.setTranslateX(100);
            hboxrecherche.setSpacing(40);

            hboxrecherche.getChildren().addAll(vboxTextField,hboxBouton);





            //pour l'image en arriere plan
            Image background = new Image( "photo.png");
            ImageView backgroundView = new ImageView(background);

            // pour l'image du petit dejeuner
            Image imageEntree = new Image("entree.jpg");
            ImageView backgroundEntree = new ImageView(imageEntree);
            backgroundEntree.setFitHeight(300);
            backgroundEntree.setFitWidth(200);

            //pour afficher et dimensionner les images du dejeuner
            Image imageDejeuner = new Image("dejeuner.png");
            ImageView backgroundDejeuner = new ImageView(imageDejeuner);
            backgroundDejeuner.setFitHeight(300);
            backgroundDejeuner.setFitWidth(200);

            //pour  afficher et dimensionner les desserts
            Image imageDessert = new Image("dessert.png");
            ImageView backgroundDessert = new ImageView(imageDessert);
            backgroundDessert.setFitHeight(300);
            backgroundDessert.setFitWidth(200);





            // le font pour les intitules des checkbox
            Font intituleCheckBox= Font.font( "Times New Roman", FontWeight.BOLD, 15);

            // le titre pour la partie regime alimentaire
            Label labelEntree= new Label("Entree");
            labelEntree.setFont(intituleCheckBox);


            // le titre pour la partie type de plat(petit dejeuner, diner, dejeuner)
            Label labelPlat= new Label("Plat");
            labelPlat.setFont(intituleCheckBox);

            // le titre pour la partie Ingredient
            Label labelDessert = new Label("Dessert");
            labelDessert.setFont(intituleCheckBox);

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
            lesCheck.getChildren().addAll(labelEntree, backgroundEntree );
            lesCheck.setSpacing(10); //espace entre tous les element

            //Insertion pour la Vbox2
            lesCheck1.getChildren().addAll(labelPlat, backgroundDejeuner);
            lesCheck1.setSpacing(10);

            //Insertion pour la Vbox3
            lesCheck2.getChildren().addAll(labelDessert, backgroundDessert);
            lesCheck2.setSpacing(10);



            // la hbox qui contient toutes les Vbox et son style
            HBox divConteneur=new HBox();
            divConteneur.getChildren().addAll(lesCheck, lesCheck1, lesCheck2);
            divConteneur.setSpacing(5);
            divConteneur.setTranslateY(100);

            divConteneur.setLayoutX(300);
            divConteneur.setLayoutY(200);
            divConteneur.setPrefSize(500,300);
            divConteneur.setStyle("-fx-background-color:#DCDCDC;");

            // Mon root
            Group root1 =new Group();
            root1.setLayoutX(0);
            root1.setLayoutY(0);


            root1.getChildren().addAll(backgroundView,titre,  hboxrecherche,divConteneur,labelMenuDuJour);


            //La scene
            Scene checkScene = new Scene(root1);

            // le stage et ses dimensions
            stage.setScene(checkScene);
            stage.setWidth(1100);
            stage.setHeight(650);
            stage.setTitle("lavraierecette.com");
            stage.show();





        }
    }







