package exam04;

public class PepperoniPizza extends Pizza {
    public String toppings = "Pepperoni";

    public PepperoniPizza() {
        super();
        this.name = "Pepperoni Pizza  ,knjbn kjh";
        this.prices = new int[]{2000, 3000, 4000};
    }

    public PepperoniPizza(String size) {
        super(size);
        this.name = "Pepperoni Pizza";
        this.prices = new int[]{2000, 3000, 4000};
    }

    @Override
    public void cook() {
        System.out.printf("%s을 추가합니다.\n", toppings);
        System.out.printf("%s %s을 조리합니다.\n", name, size);
        System.out.printf("%s %s이 완성되었습니다.\n", name, size);
    }
}