import javafx.animation.AnimationTimer;
import javafx.application.Application;



import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.image.*;






public class Interface extends Application {


    @Override
    public void start(Stage stage) throws Exception {


        Group root = new Group();
        Scene theScene = new Scene(root);
        stage.setScene(theScene);
        Canvas canvas = new Canvas( 500, 500 );
        root.getChildren().add( canvas );
        GraphicsContext gc =canvas.getGraphicsContext2D();
        gc.setFill( Color.BLUE );
        gc.setStroke( Color.BLACK );
        gc.setLineWidth(2);
        Font theFont = Font.font( "Times New Roman", FontWeight.BOLD, 48 );
                gc.setFont( theFont );
        gc.fillText( "Hello, World!", 40, 50 );
        gc.strokeText( "Hello, World!", 40, 50 );
        Image earth = new Image( "https://nimax-img.de/Produktbilder/zoom/59661_1/Globe-a-relief-AstroReality-EARTH.jpg" );
        gc.drawImage( earth, 40, 50 );
        stage.show();

        final long startNanoTime = System.nanoTime();
        new AnimationTimer()
        {
            public void handle(long currentNanoTime)
            {
                double t = (currentNanoTime -
                        startNanoTime) / 1000000000.0;
                double x = 232 + 128 * Math.cos(t);
                double y = 232 + 128 * Math.sin(t);
//                gc.drawImage( space, 0, 0 );
//                gc.drawImage( earth, x, y );
//                gc.drawImage( sun, 196, 196 );
            }
        }.start();
    }


}
//    public static void main(String[] args) {
//
//    }

//    Text text = new Text
//pour importer javafx:
//1-aller dans file
//project structure-->librairie--> plus-> chercher le lib de javafx:-> l'ajouter
//3-run->edit configuration->modify option->add VM option-> copier coller ce message:--module-path ${PATH_TO_FX} --add-modules javafx.controls,javafx.fxml,javafx.base,javafx.graphics,javafx.swing,javafx.media
//->apply ->ok


//    Scene scene = new scene(root,height,width);
//
//    scene.setFill(Color.WHITE);
//    stage.setTitle("test")
//
//   //add text
//    Text text = new Text();
//    text.setFont(new Font(v 45));
//    text.setsiza