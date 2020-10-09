import java.security.PrivateKey;

public class Products {

    private  String name;
    private double  price;
    private  int quantity;

    public Products() {
        this.name = "";
        this.price = 0.00;
        this.quantity = 0;
    }

       public Products(String name, double item, int quantity){

        this.name = name; this.price = item;  this.quantity = quantity;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

