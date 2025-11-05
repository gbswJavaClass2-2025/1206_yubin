package sec05;

public abstract class Skill {
    protected String skillName;

    public Skill(String skillName) {
        this.skillName = skillName;
    }

    public abstract void execute();
}
