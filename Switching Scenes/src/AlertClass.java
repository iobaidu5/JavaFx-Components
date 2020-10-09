import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

 class AlertClass {

     public static void dispay(String title, String messege)
     {
         Stage window = new Stage();
         window.initModality(Modality.APPLICATION_MODAL);
         window.setTitle(title);
         window.setMinWidth(250);

         Label label = new Label();
         label.setText(messege);

         Button close = new Button("Close");
         close.setOnAction(e->window.close());

         VBox layout = new VBox(10);
         layout.getChildren().addAll(label,close);
         layout.setAlignment(Pos.CENTER);


         //Display window and wait for it to be closed before returning
         Scene scene = new Scene(layout);
         window.setScene(scene);
         window.showAndWait();
     }
}
