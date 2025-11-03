package exam08;

public class WideTire extends Tire {
    private int width;

    public WideTire(String model, int maxRotation, int width) {
        super(model, maxRotation);
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
}
