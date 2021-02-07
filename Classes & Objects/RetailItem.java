public class RetailItem {

    String description = new String();
    int unitsOnHand;
    double price;

    //Setter
    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }

    //Getter
    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }
    
}
