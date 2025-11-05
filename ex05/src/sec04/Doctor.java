package sec04;

public class Doctor extends Employee {

    public Doctor(String name, int id) {
        super(name, id, 7000);
    }

    public Doctor(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    public void work() {
        System.out.println(name + " 진료를 시작합니다.");
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (baseSalary * 0.3);
    }
}
