public class BankAccount implements Account {
    private static int nextNumber = 1001; // shared by all accounts
    private final int accountNumber;
    private final String owner;
    protected double balance; // children can use it
    public BankAccount(String owner, double opening) {
        this.accountNumber = nextNumber++;
        this.owner = owner;
        this.balance = opening;
    }
    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive");
            return;
        }
        balance += amount;
    }
    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Not enough money");
            return false;
        }
        balance -= amount;
        return true;
    }
    @Override
    public double getBalance() { return balance; }
    public String getOwner() { return owner; }
    public int getAccountNumber() { return accountNumber; }
}