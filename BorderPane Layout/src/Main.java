import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

        window.setTitle("Menu");

        HBox top = new HBox();
        Button file = new Button("File");
        Button edit = new Button("Edit");
        Button view = new Button("View");
        top.getChildren().addAll(file,edit,view);
        

        VBox left = new VBox();
        Button open = new Button("Open");
        Button save = new Button("Save");
        Button close = new Button("Close");
        left.getChildren().addAll(open,save,close);

        BorderPane layout = new BorderPane();
        layout.setTop(top);
        layout.setLeft(left);

        Scene scene = new Scene(layout,250,250);
        window.setScene(scene);
        window.show();

    }
}
