import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.sql.SQLOutput;


public class Main extends Application{
      Stage window;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        window.setTitle("Grid Pane Layout");

        // A SignIn Window

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(10);
        grid.setHgap(10);

        Label username = new Label("User Name");
        GridPane.setConstraints(username,0,0);

        TextField userinput = new TextField("i.obaidu5");
        GridPane.setConstraints(userinput,1,0);


        Label password = new Label("Password");
        GridPane.setConstraints(password,0,1);

        TextField passinput = new TextField();
        passinput.setPromptText("Password");
        GridPane.setConstraints(passinput,1,1);

        Button signin = new Button("Sign In");
        GridPane.setConstraints(signin,1,2);

        signin.setOnAction(e->showdata(userinput.getText(),passinput.getText()));

         grid.getChildren().addAll(username,userinput,password,passinput,signin);

         Scene scene = new Scene(grid,300,200);
         window.setScene(scene);

         window.show();



    }

        private static void showdata(String user, String pass)
        {
            System.out.println("User Name: "+user );
            System.out.println("Password: "+pass );

        }
}
