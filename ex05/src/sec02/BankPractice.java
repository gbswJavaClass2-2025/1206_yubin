package sec02;

public class BankPractice {
    public static void main(String[] args) {
        System.out.println("----- 은행 계좌 시스템 실습 시작 -----");

        BankAccount acc1 = new BankAccount("100-01-123456", "김철수");
        SavingsAccount acc2 = new SavingsAccount("200-02-789012", "이영희", 2.5);

        System.out.println("------------------------------------");
        System.out.println("[정보 출력]");
        System.out.println("일반 계좌 정보: " + acc1.getAccountInfo());
        System.out.println("저축 계좌 정보: " + acc2.getAccountInfo());
        System.out.println("------------------------------------");

        System.out.println("[입금 기능]");
        System.out.println("--- 김철수님 일반 계좌 ---");
        acc1.deposit(100000);
        acc1.deposit(50000, "월급으로부터");

        System.out.println("--- 이영희님 저축 계좌 ---");
        acc2.deposit("초기 납입금", 50000);
        acc2.deposit(20000);
        acc2.deposit(15000, "용돈으로부터");

        System.out.println("----- 실습 종료 -----");
    }
}
