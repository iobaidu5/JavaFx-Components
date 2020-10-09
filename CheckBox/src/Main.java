import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
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

        window.setTitle("Check Box");

        CheckBox box1 = new CheckBox("Pizza");
        CheckBox box2 = new CheckBox("Burger");

     //  box2.setSelected(true);   // For Default Check

        Button button = new Button("Order Now");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10,10,10,10));
        layout.getChildren().addAll(box1,box2,button);

        Scene scene = new Scene(layout,300,200);
        window.setScene(scene);
        window.show();



    }
}

