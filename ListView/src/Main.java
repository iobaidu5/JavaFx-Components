import javafx.application.Application;
import javafx.collections.ObservableList;
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
    ListView<String> list;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;

        window.setTitle("List View");

         list = new ListView<>();
        list.getItems().addAll(
                "Pakistan","India","UAE","England","America"
        );
        list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);




        Button select = new Button("Select");
        select.setOnAction(e-> Clicked());


        VBox layout = new VBox();
        layout.setPadding(new Insets(30,30,30,30));
        layout.getChildren().addAll(list,select);

        Scene scene = new Scene(layout,300,200);
        window.setScene(scene);
        window.show();

    }

       private void Clicked()
       {
           String messege = "";
           ObservableList<String> country;
           country = list.getSelectionModel().getSelectedItems();

           for(String c: country)
           {
               messege+= c + "  ";

           }
           System.out.println(messege+" ");


       }

}

