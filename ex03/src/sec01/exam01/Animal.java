package sec01.exam01;

public class Animal {
	public String species;
	
	public Animal() {}
	
	public Animal(String species) {
		this.species = species;
	}
	
	public void eat() {
		System.out.println(this.species + ": " + this.species + "이/가 일반적인 방식으로 먹이를 먹습니다.");
	}
	public void eat(String feedstuff) {
		System.out.println(this.species + ": " + this.species + "이/가 " + feedstuff + "을/를 맛있게 먹습니다.");
	}
	public void makeSound() {
		System.out.println(this.species + "소리: " + this.species + "이/가 알 수 없는 소리를 냅니다.");
	}
}
