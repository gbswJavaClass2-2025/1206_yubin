package exam04;

public class PizzaExample {
    public static void main(String[] args) {
        CheesePizza C = new Pizza("L");
        PepperoniPizza P = new PepperoniPizza("M");

        C.cook();
        C.serve();

        System.out.println();

        P.cook();
        P.serve();
    }
}