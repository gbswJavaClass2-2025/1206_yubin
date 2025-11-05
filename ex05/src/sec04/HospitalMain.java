package sec04;

public class HospitalMain {
    public static void main(String[] args) {

        Person p1 = new Doctor("유빈", 101);
        Person p2 = new Doctor("유빈1", 102, 9000);
        Person p3 = new Nurse("유빈2", 201, 5000);

        p1.work();
        p2.work();
        p3.work();

        Doctor d = (Doctor)p2;
        Nurse n = (Nurse)p3;

        System.out.println("급여: " + d.calculateSalary());
        System.out.println("급여: " + n.calculateSalary());
    }
}
