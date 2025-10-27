package sec01.exam01;

public class PracticeExample {

	public static void main(String[] args) {
        System.out.println("----- 실습 시작 -----");
        Animal a = new Animal("호랑이");
        System.out.println(">> Animal 객체 생성: " + a.species);
        Animal d = new Dog("개", "골든 리트리버");
        System.out.println(">> Animal 객체 생성: " + d.species);

        System.out.println();

        System.out.println("[1. 상속 & 2. 객체]");
        System.out.println("--- 호랑이 정보 ---");

        System.out.println("--- 개 정보 ---");

        System.out.println();

        System.out.println("[4. 오버라이딩]");
        a.makeSound();
        d.makeSound();

        System.out.println();

        System.out.println("[3. 오버로딩]");
        a.eat();
        a.eat("생고기");

        d.eat();
        d.eat("개껌");
	   }
	}
