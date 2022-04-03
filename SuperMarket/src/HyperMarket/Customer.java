package HyperMarket;

import java.util.Set;
import java.util.Hashtable;

public class Customer extends Person{
    double bill = 0;
    Hashtable<Item, Double> cart;


    public Customer(){
        cart = new Hashtable<>();

    }

    public double getBill() {
        return bill;
    }
    public void

    addItemToCart(Item item, Double quantity){
        cart.put(item, quantity);
    }
    public double calculateBill(){
        Set<Item> keys = cart.keySet();
        for (Item item:
                keys) {
            bill +=item.price * cart.get(item);
        }
        return bill;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "bill=" + calculateBill() +
                ", items=" + cart +
                '}';
    }
}
