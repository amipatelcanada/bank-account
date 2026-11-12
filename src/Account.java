public interface Account {
    void deposit(double amount);
    boolean withdraw(double amount); // true if it worked
    double getBalance();
}