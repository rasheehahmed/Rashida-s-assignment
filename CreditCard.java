public class CreditCard {
    public static void main(String[] args) {
        CreditCard d = new CreditCard("Mohamed", "Kak Bank", "9012 5678  3456 1234", 9700, 000);
        System.out.println("Customer: " +d.getCustomer());
        System.out.println("Bank: " + d.getBank());
        System.out.println("Account: " + d.getAccount());
        System.out.println("Limit:" +d.getLimit() +"$");
        System.out.println("Balance:" + d.getBalance() + "$");

        d.updateCreditLimit(6000);
        System.out.println("Updated limit:" + d.getLimit() +"$");
    }

    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard(String customer, String bank, String account, int limit, double balance) {
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
    public void updateCreditLimit(int newLimit) {
        limit = newLimit;
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
            throw new IllegalArgumentException("Payment amount cannot be negative");
        }
        balance -= amount;
    }

}
