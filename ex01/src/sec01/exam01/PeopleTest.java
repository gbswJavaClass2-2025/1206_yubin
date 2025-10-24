package sec01.exam01;

public class PeopleTest {
	public static void main(String[] args) {
		People people = new People();
		
		people.age = 30;
		people.name = "홍길동";
		people.hometown = "율도국";
		people.gender = "남성";
		
		people.PeopleInfo();
	}
}
