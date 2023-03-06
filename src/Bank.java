import java.util.ArrayList;

public class Bank {
    public int customerLimit ;
    private ArrayList<Customer> customers = new ArrayList<>();
    public Bank(int customerLimit){
        this.customerLimit = customerLimit;
    }

    public static int getTotalBanks(){
        return 1;
    }
    public void registerCustomer(String name){
        Customer c = new Customer(name);
        customers.add(c);

    }

    public void displayCustomers(){
        for (Customer c:customers  ) {

            System.out.println(c);
        }
    }

}
