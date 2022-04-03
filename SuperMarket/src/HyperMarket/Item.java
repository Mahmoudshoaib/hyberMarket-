package HyperMarket;

public class Item {
    String name;
    double price;
    double totalQuantity;

    public Item( String name, double quantity, double price) {

        this.name = name;
        this.price = price;
        this.totalQuantity = quantity;
    }

    public double getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(double totalQuantity) {
        this.totalQuantity = totalQuantity;
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

    @Override
    public String toString() {
        return "Item{" +
                " name='" + name + '\'' +
                ", price=" + price +
                ",total quantity=" + totalQuantity +
                '}';
    }
}
