import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {
    Stage window;
    TableView<Products> table;

    TextField nameinput, priceinput,qtyinput;
    Button add,delete;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;

        window.setTitle("Table View");

        // Creating Name Column
        TableColumn<Products,String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        // Creating Price Column
        TableColumn<Products,String> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));


        // Creating Quantity Column
        TableColumn<Products,String> qtyColumn = new TableColumn<>("Quantity");
        qtyColumn.setMinWidth(100);
        qtyColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));


        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn,priceColumn,qtyColumn);

        nameinput = new TextField();
        nameinput.setPromptText("Enter Name");

        priceinput = new TextField();
        priceinput.setPromptText("Enter Price");

        qtyinput = new TextField();
        qtyinput.setPromptText("Enter Quantity");


        add = new Button("Add");
        add.setOnAction(e->addClicked());

        delete = new Button("Delete");
        delete.setOnAction(e->deleteClicked());

        HBox footer = new HBox();
                footer.setPadding(new Insets(10,10,10,10));
                footer.setSpacing(10);
                footer.getChildren().addAll(nameinput,priceinput,qtyinput,add,delete);




        VBox layout = new VBox();
        layout.getChildren().addAll(table,footer);

        Scene scene = new Scene(layout,600 ,500);
        window.setScene(scene);
        window.show();

    }

        // Get All The Products

       public  ObservableList<Products> getProduct(){
        ObservableList<Products> products = FXCollections.observableArrayList();
        products.add(new Products("Laptops", 10000,20));
           products.add(new Products("Mobile", 1000,10));
           products.add(new Products("PC", 15000,50));

           return  products;
       }

          private  void addClicked(){
              Products product = new Products();
              product.setName(nameinput.getText());
              product.setPrice(Double.parseDouble(priceinput.getText()));
              product.setQuantity(Integer.parseInt(qtyinput.getText()));
              table.getItems().add(product);
              nameinput.clear();
              priceinput.clear();
              qtyinput.clear();
          }

          private void  deleteClicked(){
        ObservableList<Products> productSelected, allProducts;
        allProducts = table.getItems();
        productSelected = table.getSelectionModel().getSelectedItems();

        productSelected.forEach(allProducts::remove);
    }


}

