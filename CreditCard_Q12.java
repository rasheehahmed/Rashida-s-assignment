public class CreditCard_Q12 {
    public static void main(String[] args) {
        CreditCard a = new CreditCard("Mohamed", "Kak Bank", "9012 5678  3456 1234", 9700, 000);
        System.out.println("Customer: " + a.getCustomer());
        System.out.println("Bank: " + a.getBank());
        System.out.println("Account: " + a.getAccount());
        System.out.println("Limit: " + a.getLimit() + "$");
        System.out.println("Balance: " + a.getBalance() + "$");

        a.makePayment(600);
        a.makePayment(-100);
        System.out.println("Updated balance:" + a.getBalance() + "$");
    }
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard_Q12(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }
    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }
    public boolean charge(double price) {
        if (price + balance > limit) {
            return false;
        }
        balance += price;
        return true;
    }
    public void makePayment(double amount) {
        if (amount < 0) {
            System.out.println("Ignoring payment request for negative amount: $" + amount);
            return;
        }
        balance -= amount;
    }

}
