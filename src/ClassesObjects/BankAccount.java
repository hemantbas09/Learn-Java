// Create a BankAccount class with fields accountNumber and balance. Write methods deposit(double amount) and printBalance().


package ClassesObjects;

public class BankAccount {

    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void printBalance() {
        System.out.println("Balance: " + balance);
    }

    public  double getBalance(){
        return this.balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(101);

        account.accountNumber = 101;
        account.deposit(500);
        account.deposit(500);
        account.deposit(200);

        account.printBalance();
    }
}
