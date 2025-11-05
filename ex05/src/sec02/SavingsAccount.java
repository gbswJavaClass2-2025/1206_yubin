package sec02;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String ownerName, double interestRate) {
        super(accountNumber, ownerName);
        this.interestRate = interestRate;
    }

    public void deposit(String memo, int amount) {
        balance += amount;
        System.out.println("[입금] 금액: " + amount + " 원 (" + memo + ") | 현재 잔액: " + balance + " 원");
    }

    @Override
    public String getAccountInfo() {
        return "계좌 번호: " + accountNumber + " | 예금주: " + ownerName + " | 잔액: " + balance + " 원 | 이율: " + interestRate + "% (저축 계좌)";
    }
}

