package HyperMarket;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Department de = new Department();
        initialGrocery(de);
        initialAppliance(de);
        Customer cu = new Customer();
        cu.addItemToCart(de.getItem("Tomato"),2.5);
        cu.addItemToCart(de.getItem("Cooker"),1.0);
        System.out.println(cu);
    }
    public static void initialGrocery(Department grocery){
        ArrayList<Item> GroceryItems = new ArrayList<>();
        Item tomato = new Item( "Tomato", 20 ,12.5);
        Item potato = new Item("Potato", 20 ,10);
        Item redOnion = new Item("Red Onion", 20 ,6.5);
        GroceryItems.add(tomato);
        GroceryItems.add(potato);
        GroceryItems.add(redOnion);
        grocery.setItems(GroceryItems);
    }

    public static void initialAppliance(Department appliance){
        ArrayList<Item> applianceItems = new ArrayList<>();
        Item cooker = new Item("Cooker", 10 ,9000);
        Item washingMachine = new Item("Washing Machine", 5 ,8500);
        Item waterHeater = new Item( "Water Heater", 8 ,6.5);
        applianceItems.add(cooker);
        applianceItems.add(washingMachine);
        applianceItems.add(waterHeater);
        appliance.setItems(applianceItems);
    }

}
