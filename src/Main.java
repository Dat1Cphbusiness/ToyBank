public class Main {


    public static void main(String[] args) {
        Bank bank = new Bank(3);
        Bank.getTotalBanks();
        TextUI ui = new TextUI();
        int count = 0;
        while(count < bank.customerLimit){
            String name = ui.getInput("Skriv kundens navn: ");
            bank.registerCustomer(name);
            count++;
        }
        bank.displayCustomers();

    }
}