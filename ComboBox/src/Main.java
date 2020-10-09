import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
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

        window.setTitle("Combo Box");

        ComboBox<String> combo = new ComboBox<>();
        combo.getItems().addAll(
                "Swat","Mardan","Peshawar","Islamabad"
        );

        combo.setPromptText("Cities In Pakistan");

       // combo.setEditable(true);                // Allow User To Select Value by own Choice

        Button select = new Button("Select");
        select.setOnAction(e-> System.out.println(combo.getValue()));


        VBox layout = new VBox();
        layout.setPadding(new Insets(30,30,30,30));
        layout.getChildren().addAll(combo,select);

        Scene scene = new Scene(layout,300,200);
        window.setScene(scene);
        window.show();



    }
}

