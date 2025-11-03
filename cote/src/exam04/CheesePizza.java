package exam04;

public abstract class CheesePizza {
    public String name = "Cheese Pizza";
    public int[] prices = {1000, 2000, 3000};
    public String size = "M";

    public CheesePizza() {}

    public CheesePizza(String size) {
        this.size = size;
    }

    public void cook() {
        System.out.printf("%s %s을 조리합니다.\n", name, size);
        System.out.printf("%s %s이 완성되었습니다.\n", name, size);
    }
    public void serve() {
        System.out.printf("%s %s를 드립니다. %d원 입니다.\n", name, size, prices[2]);
    }
}

