public class ChequingAccount extends BankAccount {
    private final double overdraftLimit = 200;
    public ChequingAccount(String owner, double opening) {
        super(owner, opening); // run BankAccount's constructor
    }
    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance + overdraftLimit) {
            System.out.println("Over overdraft limit");
            return false;
        }
        balance -= amount;
        return true;
    }
}
