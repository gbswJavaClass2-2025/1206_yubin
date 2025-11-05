package sec03;

public class PremiumTicket extends FlightTicket {
    private String serviceClass;
    private int loungeFee;

    public PremiumTicket(String flightNumber, String passengerName, int baseFare, String serviceClass, int loungeFee) {
        super(flightNumber, passengerName, baseFare);
        this.serviceClass = serviceClass;
        this.loungeFee = loungeFee;
    }

    public void reserveSeat(String seat, String request, boolean isBusiness) {
        this.seat = seat;
        if (isBusiness) {
            System.out.println(flightNumber + " (프리미엄): [예약] 비즈니스 좌석 " + seat + " 이/가 배정되었습니다. (요청: " + request + ")");
        } else {
            System.out.println(flightNumber + " (프리미엄): [예약] 일반 좌석 " + seat + " 이/가 배정되었습니다. (요청: " + request + ")");
        }
    }

    @Override
    public String getReservationDetails() {
        return "항공편: " + flightNumber + " | 탑승객: " + passengerName + " | 좌석: " + seat + " | 기본 운임: " + baseFare + " 원" + " | 클래스: " + serviceClass + " | 라운지 이용료: " + loungeFee + " 원";
    }
}
