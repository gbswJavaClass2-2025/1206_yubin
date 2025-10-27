package sec01.exam01;

public class Dog extends Animal {
	public String bread;
	
	public Dog() {}
	
	public Dog(String species, String bread) {
		super(species);
		this.bread = bread;
	}
	
	@Override
	public void makeSound() {
		System.out.println(this.bread + " 소리: 멍멍!(품종: " + this.bread + ")");
	}
	@Override
	public void eat() {
        System.out.println(this.bread + ": " + this.species + "이/가 일반적인 방식으로 먹이를 먹습니다.");
	}
    public void eat(String feedstuff) {
        System.out.println(this.bread + ": " + "개이/가 " + feedstuff + "을/를 맛있게 먹습니다.");
        System.out.println(this.bread + ": " + "개(" + this.bread + ")가 500 칼로리만큼 에너지를 보충합니다.");
    }
}
