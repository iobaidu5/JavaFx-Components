import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends  Application{
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;

        Label label1 = new Label("User Name");
        label1.setStyle("-fx-text-fill: #f8f8f8");
        label1.setId("bold-label");  //CSS
        Label label2 = new Label("Password");
        label2.setStyle("-fx-text-fill: #f8f8f8");
        label2.setId("bold-label"); //CSS

        TextField name = new TextField();
        name.setPromptText("Enter User Name");

        TextField pass = new TextField();
        pass.setPromptText("Enter Password");

        Button login = new Button("Log In");
        Button signup = new Button("Sign Up");
        signup.getStyleClass().add("button-signup");

        GridPane layout = new GridPane();
        layout.setPadding(new Insets(70,70,50,70));
        layout.setHgap(10);
        layout.setVgap(10);

        GridPane.setConstraints(label1,0,0);
        GridPane.setConstraints(name, 1,0);
        GridPane.setConstraints(label2,0,1);
        GridPane.setConstraints(pass, 1,1);
        GridPane.setConstraints(login,1,2);
        GridPane.setConstraints(signup,4,0);

        layout.getChildren().addAll(label1,name,label2,pass,login,signup);

        Scene scene = new Scene(layout,500,300);
        scene.getStylesheets().add("Style.css");
        window.setScene(scene);
        window.show();

    }
}
