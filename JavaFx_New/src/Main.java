import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.EventListener;

public class Main extends Application  {

       Button button, button2;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception

    {

            primaryStage.setTitle("Hey!!");

            button = new Button();
            button2 = new Button("Hey Baby!");
            button.setText("Click Me!");

            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {

                    System.out.println("I Am Annonymous inner Class ");
                }
            });


            // Calling Lambda Expression(Single Line Expression) For Button 2

              // button2.setOnAction(e -> System.out.println("Hey! I Am Labmda Expression!"));




            StackPane layout = new StackPane();
            layout.getChildren().addAll(button,button2);

            Scene scene = new Scene(layout,400,400);

            primaryStage.setScene(scene);
            primaryStage.show();


    }


}
