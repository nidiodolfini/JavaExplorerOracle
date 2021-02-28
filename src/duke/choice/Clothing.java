package duke.choice;

public class Clothing {
    
    private String description;
    private double price;
    private String size = "M";
    public final double  MINIMUM_PRICE = 10.0;
    public final double TAX_RATE = 0.2;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price * ( 1 + TAX_RATE);
    }

    public void setPrice(double price) {
            this.price = (price > MINIMUM_PRICE) ? price : MINIMUM_PRICE;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
}