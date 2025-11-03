package exam08;

public class Tire {
    private String model;
    private int maxRotation;
    private int currentRotation;

    public Tire(String model, int maxRotation) {
        this.model = model;
        this.maxRotation = maxRotation;
        this.currentRotation = 0;
    }

    public String getModel() {
        return model;
    }
    public int getMaxRotation() {
        return maxRotation;
    }
    public int getCurrentRotation() {
        return currentRotation;
    }

    public boolean roll() {
        if (currentRotation >= maxRotation) {
            return false;
        }
        currentRotation++;
        return true;
    }
}
