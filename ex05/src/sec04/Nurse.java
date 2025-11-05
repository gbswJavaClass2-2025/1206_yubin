package sec04;

public class Nurse extends Employee {
    public Nurse(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    public void work() {
        System.out.println(name + " 환자를 돌봅니다.");
    }
}
