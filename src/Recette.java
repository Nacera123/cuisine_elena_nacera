import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
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
        Image image1 = new Image("tiramisu.jpg");
        ImageView imageEntree = new ImageView(image1);
        imageEntree.setFitHeight(150);
        imageEntree.setFitWidth(450);

        //le scrollPane pour afficher le contenu du fichier csv
        ScrollPane scrollIngredient = new ScrollPane();
        scrollIngredient.setContent(imageEntree);

        // le font pour les intitules des checkbox
        Font intituleCheckBox= Font.font( "Times New Roman", FontWeight.BOLD, 15);

        // le titre pour la partie regime alimentaire
        Label labelEntree= new Label("Tiramisu");
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
        vBoximage1.getChildren().addAll(labelEntree, imageEntree);

        VBox vBoximage2 =new VBox();
        vBoximage2.setPrefSize(200,455);
        vBoximage2.getChildren().add(scrollIngredient);
   ;

        VBox vBoximage3 =new VBox();
        vBoximage3.setPrefSize(200,455);


        //le contenu de toutes les recettes
        VBox vBoxConteneur =new VBox();
        vBoxConteneur.setPrefSize(470,570);
        vBoxConteneur.setStyle("-fx-background-color:#F0F8FF");
        vBoxConteneur.setTranslateY(70);
        vBoxConteneur.setTranslateX(300);
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
        borderPane.getChildren().addAll(backgroundImage, titre, vBoxConteneur);

        //la scene
        Scene scene= new Scene(borderPane,1100,650);
        stage.setScene(scene);


        stage.setTitle("lavraierecette.com/resultatdemarecherche");
        //afficher le stage
        stage.show();

    }
}
