package ClassesObjects;
// Create a Bank class holding an array of BankAccount objects. Add a method that returns the account with the highest balance.

public class Bank {


    private final BankAccount[] accounts;

    Bank(BankAccount[] accounts){
        this.accounts= accounts;
    }

    public BankAccount getHighestBalanceAccount() {
        if(accounts.length == 0){
            return null;
        }
        BankAccount highest = accounts[0];
        for (BankAccount account : accounts) {
            if (account.getBalance() > highest.getBalance()) {
                highest = account;
            }
        }
        return highest;
    }

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(1);
        BankAccount a2 = new BankAccount(2);
        BankAccount a3 = new BankAccount(3);
        a1.deposit(150.50);
        a2.deposit(3000.00);
        a3.deposit(42.75);
        Bank bank = new Bank(new BankAccount[]{a1, a2, a3});
        BankAccount richest = bank.getHighestBalanceAccount();
        System.out.println("Richest account #" + richest.getAccountNumber()
                + " balance: $" + richest.getBalance());
    }

}
