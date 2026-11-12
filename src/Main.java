public class Main {
    public static void main(String[] args) {
        BankAccount[] accounts = {
                new BankAccount("Asha", 100),
                new ChequingAccount("Ravi", 100)
        };
        for (BankAccount a : accounts) {
            a.withdraw(250);
            System.out.println(a.getOwner() + ": " + a.getBalance());
        }
    }
}