package ex04;

public class PizzaShop {

	public static void main(String[] args) {
		        System.out.println("----- 피자 가게 시스템 실습 시작 -----");
		        System.out.println(">> Pizza 객체 생성: 씬 크러스트 10 인치 피자");
		        Pizza p1 = new Pizza("씬 크러스트 도우", 10);

		        System.out.println(">> Pizza 객체 생성: 핸드 토스 12 인치 피자");
		        ToppingPizza p2 = new ToppingPizza("핸드 토스 도우", 12, "모짜렐라");

		        System.out.println(">> Pizza 객체 생성: 팬 도우 14 인치 피자");
		        ToppingPizza p3 = new ToppingPizza("팬 도우 도우", 14, "페퍼로니");

		        System.out.println("------------------------------------");
		        System.out.println("[4. 오버라이딩 (설명)]");
		        p1.describe();
		        p2.describe();
		        p3.describe();

		        System.out.println("------------------------------------");
		        System.out.println("[3. 오버로딩 (굽기)]");
		        p1.bake();
		        p1.bake(15);

		        System.out.println();
		        p3.bake();
		        System.out.println();
		        p3.bake(20);
		        System.out.println();
		        p3.bake(18, 350);

		        System.out.println("----- 실습 종료 -----");
	}

}
