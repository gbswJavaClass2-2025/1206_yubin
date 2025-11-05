package sec04;

public class Employee extends Person {
    protected double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        super(name, id);
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public void work() {
    }
}
