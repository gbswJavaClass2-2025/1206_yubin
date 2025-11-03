package exam08;

public class TireExample {
    public static void main(String[] args) {
        Tire a = new Tire("기본 타이어", 100);
        WideTire b = new WideTire("업그레이트 타이어", 120, 35);
        ColorTire c = new ColorTire("색상 타이어", 110, "blue");
    }
}
