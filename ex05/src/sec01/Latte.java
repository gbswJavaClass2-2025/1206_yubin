package sec01;

public class Latte extends Coffee {
    public String foamType;
    public int milkCharge = 500;

    public Latte(String name, String size, int basePrice, String foamType) {
        super(name, size, basePrice);
        this.foamType = foamType;
    }

    public int calculatePrice(int extraShotPrice) {
        return basePrice + milkCharge + extraShotPrice;
    }

    @Override
    public String getBeverageInfo() {
        return super.getBeverageInfo() + " | 거품 종류: " + foamType;
    }
}
