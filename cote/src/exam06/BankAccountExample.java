package exam06;

public class BankAccountExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("유빈", "123456789");

        int deposit = account.deposit(10000);
        System.out.println(deposit + "원");

        int withdrawal = account.withdrawal(5000);
        System.out.println(withdrawal + "원");

        int withdrawal1 = account.withdrawal(6000);
        System.out.println(withdrawal1 + "원");
    }
}