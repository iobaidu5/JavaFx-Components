import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

      Stage window;
      Scene scene1,scene2;


    public static void main(String[] args) {

        launch(args);
    }

        public void start(Stage primaryStage){

             window = primaryStage;

             Label label1 = new Label("Hey I Am Scene 1");
             Button b1 = new Button("Next To Stage 2");
             b1.setOnAction(e->window.setScene(scene2));

            Button alertbtn = new Button("Alert!!!");
            alertbtn.setOnAction(e-> AlertClass.dispay("Alert!!!", "This Is A AlertBox"));

            //Layout 1 - children laid out in vertical column
            VBox layout1 = new VBox(20);
            layout1.getChildren().addAll(label1, b1,alertbtn);
            scene1 = new Scene(layout1, 500, 500);




            // Scene 2

            Label label2 = new Label("Hey! I Am Scene 2 ");
            Button b2 = new Button("Previous To Stage 1");
            b2.setOnAction(e->window.setScene(scene1));

            //   Setting Alert Messege On Scene 1




             // Layout 2
            StackPane layout2 = new StackPane();
            layout2.getChildren().addAll(label2,b2);

            scene2 = new Scene(layout2,500,500);





            // Displaying Scene1 First

            window.setScene(scene1);
            window.setTitle("Switching Scene");
            window.show();

        }




}








