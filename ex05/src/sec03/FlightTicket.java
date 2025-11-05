package sec03;

public class FlightTicket {
    protected String flightNumber;
    protected String passengerName;
    protected String seat;
    protected int baseFare;

    public FlightTicket(String flightNumber, String passengerName, int baseFare) {
        this.flightNumber = flightNumber;
        this.passengerName = passengerName;
        this.baseFare = baseFare;
        System.out.println(">> FlightTicket 객체 생성: " + flightNumber + ", 탑승객: " + passengerName);
    }

    public void reserveSeat(String seat) {
        this.seat = seat;
        System.out.println(flightNumber + " (일반): [예약] 일반 좌석 " + seat + " 이/가 배정되었습니다.");
    }

    public void reserveSeat(String seat, String memo) {
        this.seat = seat;
        System.out.println(flightNumber + " (일반): [예약] 일반 좌석 " + seat + " 이/가 배정되었습니다. (" + memo + ")");
    }

    public String getReservationDetails() {
        return "항공편: " + flightNumber + " | 탑승객: " + passengerName + " | 좌석: " + seat + " | 기본 운임: " + baseFare + " 원";
    }
}
