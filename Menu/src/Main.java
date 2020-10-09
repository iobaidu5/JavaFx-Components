import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {
    Stage window;
    BorderPane layout;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;

        window.setTitle("Menu");


        // File Menu

        Menu filemenu = new Menu("File");

        MenuItem New = new MenuItem("New");
        New.setOnAction(e-> System.out.println("New File Created.."));  //To Set An Action For MenuItem
        filemenu.getItems().add(New);

        filemenu.getItems().add(new MenuItem("Open"));
        filemenu.getItems().add(new MenuItem("Save"));
        filemenu.getItems().add(new SeparatorMenuItem());   // To Separate Items by Line
        filemenu.getItems().add(new MenuItem("Setting"));
        filemenu.getItems().add(new SeparatorMenuItem());
        filemenu.getItems().add(new MenuItem("Exit"));

        // Edit Menu

        Menu Edit = new Menu("_Edit");   // _ mean To UnderLine the First Word i.e E
        Edit.getItems().add(new MenuItem("Cut"));
        Edit.getItems().add(new MenuItem("Copy"));

        MenuItem paste = new MenuItem("Paste");
        paste.setDisable(true);                        // To Disable An Option
        Edit.getItems().add(paste);

        //Help Menu
         Menu help = new Menu("Help");
         // set Check Menu Item
         CheckMenuItem check = new CheckMenuItem("Click For Check");  // For Check Tick
         check.setOnAction(e->{

         if(check.isSelected())
             System.out.println("Checked");
         else
             System.out.println("UnChecked");
         });

         help.getItems().add(check);


         // Radio Check Item

           Menu stage = new Menu("Stage");
           ToggleGroup toggle = new ToggleGroup();

           RadioMenuItem easy = new RadioMenuItem("Easy");
           RadioMenuItem medium = new RadioMenuItem("Medium");
           RadioMenuItem hard = new RadioMenuItem("Hard");

           easy.setToggleGroup(toggle);
           medium.setToggleGroup(toggle);
           hard.setToggleGroup(toggle);
           stage.getItems().addAll(easy,medium,hard);

        MenuBar bar = new MenuBar();
        bar.getMenus().addAll(filemenu,Edit,help,stage);

        layout = new BorderPane();
        layout.setTop(bar);



        Scene scene = new Scene(layout,600 ,500);
        window.setScene(scene);
        window.show();

    }






}

