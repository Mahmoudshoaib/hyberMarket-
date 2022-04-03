package HyperMarket;

import java.util.Set;

public class Cashier extends Person{
    String name;
    private double salary;
    static int id = 0;
    public Cashier(String name, double salary){
        id++;
        this.name = name;
        this.salary=salary;
        ID = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void getThePriceOfBill(Customer customer){
        System.out.println("your bill is " + customer.getBill());
        Set<Item> keys = customer.cart.keySet();
        // reduce the quantity

    }

}

