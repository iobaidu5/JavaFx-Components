import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;

        window.setTitle("Drop Down Menu");

        ChoiceBox<String> choice = new ChoiceBox<>();

        choice.getItems().addAll("--Select--", "Apples","Banana", "Peach", "Orange", "Mango", "Grapes");
        choice.setValue("--Select--");  // For Top

        // Listen To The Selection Changes

        choice.getSelectionModel().selectedItemProperty().addListener( (v, oldValue, newValue) -> {
           if(newValue == "--Select--")
               System.out.print("");
           else
            System.out.println(newValue);
        });

        Button select = new Button("Order Now!");

         VBox layout = new VBox();
         layout.setPadding(new Insets(30,30,30,30));
         layout.getChildren().addAll(choice,select);

        Scene scene = new Scene(layout,300,200);
        window.setScene(scene);
        window.show();



    }
}

