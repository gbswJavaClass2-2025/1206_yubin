package exam08;

public class ColorTire extends Tire {
    private String color;

    public ColorTire(String model, int maxRotation, String color) {
        super(model, maxRotation);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
