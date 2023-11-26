public class lap1_Q13 {
    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("Mohamed", "Kak Bank", "9012 5678  3456 1234", 600, 100000);
        wallet[1] = new CreditCard("Hani", "Kak Bank", "7654 9876  1098 5432", 2500, 56700);
        wallet[2] = new CreditCard("Ahmed", "Kak Bank", " 3456 9012 5678  7890", 4300, 34100);

        for (int val = 1; val <= 16; val++) {
            wallet[0].charge(3 * val);
            wallet[1].charge(2 * val);
            wallet[2].charge(val);
        }

        for (CreditCard card : wallet) {
            System.out.println("Customer: " + card.getCustomer());
            System.out.println("Bank: " + card.getBank());
            System.out.println("Account: " + card.getAccount());
            System.out.println("Limit: " + card.getLimit() + "$");
            System.out.println("Balance: " + card.getBalance() + "$");
            System.out.println("____________________________________");
        }
    }

    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;
    public lap1_Q13(String customer, String bank, String account, int limit, double balance) {
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
            throw new IllegalArgumentException("negative");
        }
        balance -= amount;
    }

}
