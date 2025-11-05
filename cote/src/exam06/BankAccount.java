 package exam06;

public class BankAccount {
    private String name;
    private String accountNumber;
    private int balance;
    private static int count = 0;

    public BankAccount(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0;
        count++;
    }

    public BankAccount(String name, String accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        count++;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }
    
    public int withdrawal(int amount) {
        if (amount > balance) {
            balance = 0;
        } else {
            balance -= amount;
        }
        return amount;
    }


    public static int getCount() {
        return count;
    }
}
