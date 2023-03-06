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
        //todo: make sure that the account reference has been initialized or you will see a nullpointerException when this runs
        return getName()+ ": "+ this.account.getBalance();

    }


}
