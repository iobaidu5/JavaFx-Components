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
    TreeView<String> tree;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;

        window.setTitle("Tree View");

        TreeItem<String> root,menu, file;

        root = new TreeItem<>();
        root.setExpanded(true);

        //For Menu

        menu = Branch("Project 1",root);
         Branch("Project 2",menu);
         Branch("Project 3",menu);
         Branch("Project 4",menu);


//         For File

        file = Branch("File 1",root);
        Branch("File 2",file);
        Branch("File 3",file);



        //Create the tree and hide the main Root
        tree = new TreeView<>(root);
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedItemProperty()
                .addListener((v, oldValue, newValue) -> {
                    if (newValue != null)
                        System.out.println(newValue.getValue());
                });



        VBox layout = new VBox();
        layout.setPadding(new Insets(30,30,30,30));
        layout.getChildren().add(tree);

        Scene scene = new Scene(layout,300,200);
        window.setScene(scene);
        window.show();

    }


    public TreeItem<String> Branch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }

}

