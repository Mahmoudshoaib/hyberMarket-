package HyperMarket;
import java.util.ArrayList;

public class Manger extends Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void modifySalaryForCashier(int id, ArrayList<Cashier> cashiers, double salary){
        for (Cashier cashier :
                cashiers) {
            if (cashier.ID == id){
                cashier.setSalary(salary);
                System.out.println("Done!");
            }
        }
    }
}

