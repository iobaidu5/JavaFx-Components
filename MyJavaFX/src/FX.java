import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class FX extends Application {

       public static void main(String[] args)
       {
          launch(args);
       }

       public void start (Stage primaryStage) throws  Exception
       {
//           Button btn = new Button ("Click Me!");
//           btn.setOnAction(new EventHandler<ActionEvent>() {
//               @Override
//               public void handle(ActionEvent event) {
//                   System.out.println("Hello World");
//               }
//           });
//
//           Button exit = new Button("Exit!");
//           exit.setOnAction(e->{
//               System.out.println("Good Night!!!");
//               System.exit(0);
//           });
//
//
//
//           //StackPane root = new StackPane()
//
//           VBox root = new VBox();
//           root.getChildren().addAll(btn,exit);

           //   Scene Builder Override On Upper Code

           Parent root = FXMLLoader.load(getClass().getResource("MainFX.fxml"));
           Scene scene = new Scene(root);
           primaryStage.setTitle("Obaid Khan");
           primaryStage.setScene(scene);
           primaryStage.show();

       }
}
