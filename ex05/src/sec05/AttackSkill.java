package sec05;

public class AttackSkill extends Skill {
    private int damage;

    public AttackSkill(String skillName, int damage) {
        super(skillName);
        this.damage = damage;
    }

    @Override
    public void execute() {
        System.out.println("Dealt " + damage + " damage using " + skillName + ".");
    }
}
