package sec02;

public class BankAccount {
    protected String accountNumber;
    protected String ownerName;
    protected int balance;

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0;
        System.out.println(">> BankAccount 객체 생성: " + ownerName + "님 계좌(" + accountNumber + ") 개설.");
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("[입금] 금액: " + amount + " 원 | 현재 잔액: " + balance + " 원");
    }

    public void deposit(int amount, String memo) {
        balance += amount;
        System.out.println("[입금] 금액: " + amount + " 원 (" + memo + ") | 현재 잔액: " + balance + " 원");
    }

    public String getAccountInfo() {
        return "계좌 번호: " + accountNumber + " | 예금주: " + ownerName + " | 잔액: " + balance + " 원";
    }
}

