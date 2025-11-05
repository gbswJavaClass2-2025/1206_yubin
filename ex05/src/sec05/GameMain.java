package sec05;

public class GameMain {
    public static void main(String[] args) {
        Warrior w1 = new Warrior("기사");
        Warrior w2 = new Warrior("궁수", 10);

        AttackSkill slash = new AttackSkill("Slash", 120);

        w1.useSpecialAbility();
        w2.useSpecialAbility();

        slash.execute();
    }
}
