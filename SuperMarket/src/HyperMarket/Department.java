package HyperMarket;

import java.util.ArrayList;


public class Department {
    private int id;
    protected String name;
    ArrayList<Item> items;

    public Department() {
        items = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(Item item) {
        items.add(item);

    }
    public Item getItem(String name){
        for (Item item:
                items) {
            if (item.name.equals(name)){
                return item;
            }
        }
        return null;

    }
    public void setItems(ArrayList<Item> incomeItem) {
        items.addAll(incomeItem);

    }

    @Override
    public String toString() {
        return "Department{" +
                ", name='" + name + '\''+ '\n' +
                ", items=" + items +
                '}';
    }
}

