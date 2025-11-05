package sec03;

public class BookingSystem {
    public static void main(String[] args) {
        System.out.println("----- 비행기 예매 시스템 실습 시작 -----");

        FlightTicket t1 = new FlightTicket("KE001", "박민준", 300000);
        PremiumTicket t2 = new PremiumTicket("OZ202", "최서연", 1500000, "비즈니스", 50000);

        System.out.println("------------------------------------");
        System.out.println("[좌석 예약]");

        t1.reserveSeat("45A");
        t1.reserveSeat("45B", "탑승 수속 완료");

        t2.reserveSeat("01C", "수속 완료", false);
        t2.reserveSeat("01D", "수속 미완료", false);
        t2.reserveSeat("02A", "채식 기내식 요청", true);

        System.out.println("------------------------------------");
        System.out.println("[예약 상세 정보]");

        System.out.println("일반 항공권: " + t1.getReservationDetails());
        System.out.println("프리미엄 항공권: " + t2.getReservationDetails());

        System.out.println("----- 실습 종료 -----");
    }
}
