package sec01;

public class Coffee {
    public String name;
    public String size;
    public int basePrice;

    public Coffee(String name, String size, int basePrice) {
        this.name = name;
        this.size = size;
        this.basePrice = basePrice;
    }

    public int calculatePrice() {
        return basePrice;
    }

    public int calculatePrice(double discountRate) {
        return (int)(basePrice * (1 - discountRate / 100));
    }

    public String getBeverageInfo() {
        return "종류: " + name + " | 사이즈: " + size + " | 기본 가격: " + basePrice + " 원";
    }
}

