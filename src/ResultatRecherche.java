import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class ResultatRecherche extends Application{
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        // texte resultat de mes recherche
        Label textResultatRecherche= new Label("Resultat de vos recherches");
        Font font = Font.font("Times New Roman", FontWeight.LIGHT, 20);
        textResultatRecherche.setFont(font);
        textResultatRecherche.setTranslateY(100);
        textResultatRecherche.setTranslateX(5);
        textResultatRecherche.setTextFill(Color.rgb(240,255,240));

        //les images
        Image image1 = new Image("entree.jpg");
        ImageView imageEntree = new ImageView(image1);
        imageEntree.setFitHeight(150);
        imageEntree.setFitWidth(450);

        Image image2 = new Image("dejeuner.png");
        ImageView imageDejeuner = new ImageView(image2);
        imageDejeuner.setFitWidth(450);
        imageDejeuner.setFitHeight(150);

        Image image3 = new Image("dessert.png");
        ImageView imageDessert= new ImageView(image3);
        imageDessert.setFitHeight(150);
        imageDessert.setFitWidth(450);


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


        //les Vbox qui vont contenir le resultat
        VBox vBoximage1 =  new VBox();
        vBoximage1.setPrefSize(200,455);
        vBoximage1.getChildren().addAll(imageEntree,labelEntree);

        VBox vBoximage2 =new VBox();
        vBoximage2.setPrefSize(200,455);
        vBoximage2.getChildren().addAll(imageDejeuner, labelPlat);

        VBox vBoximage3 =new VBox();
        vBoximage3.setPrefSize(200,455);
        vBoximage3.getChildren().addAll(imageDessert, labelDessert);

        //le contenu de toutes les recettes
        VBox vBoxConteneur =new VBox();
        vBoxConteneur.setPrefSize(470,500);
        vBoxConteneur.setStyle("-fx-background-color:#F0F8FF");
        vBoxConteneur.setTranslateY(125);
        vBoxConteneur.setTranslateX(5);
        vBoxConteneur.getChildren().addAll(vBoximage1,vBoximage2,vBoximage3);
        vBoxConteneur.setPadding(new Insets(10));;


        // le titre du site
       Label titre= new Label("La Vraie Recette");

        //le font du titre du site
        Font fontTitre = Font.font("Times New Roman", FontWeight.BOLD, 40);
        titre.setFont(fontTitre);

        titre.setTextFill(Color.rgb(176,224,230));
        titre.setTranslateX(400);
        titre.setTranslateY(20);

        //image d'arriere plan
        Image image=new Image("photo.png");
        ImageView backgroundImage= new ImageView(image);

        //le border pane
        Group borderPane=new Group();
        borderPane.getChildren().addAll(backgroundImage, titre, textResultatRecherche, vBoxConteneur);

        //la scene
        Scene scene= new Scene(borderPane,1100,650);
        stage.setScene(scene);


        stage.setTitle("lavraierecette.com/resultat");
        //afficher le stage
        stage.show();


    }
}
