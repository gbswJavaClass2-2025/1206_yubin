package sec05;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, 1);
    }

    public Warrior(String name, int level) {
        super(name, level);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " (Lv." + level + "): Charge!");
    }
}
