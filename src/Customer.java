public class Customer {
    private Account account;
    private String name;
    private int id;
    private static int counter = 1;

    public Customer(String name){
        this.name = name;
        this.id  = counter;
        counter++;
    }

    public Account getAccount(){
        return this.account;
    }

    public String getName(){
        return this.name;
    }
    public String toString(){
        return getName()+ ": "+ this.account.getBalance();

    }


}
