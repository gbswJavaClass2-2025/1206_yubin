package exam02;

public class OrderExample {

	public static void main(String[] args) {
		Menu b = new Menu("햄버거", 5000);
		Menu p = new Menu("감자튀김", 2500);
		Menu c = new Menu("콜라", 1500);
		
		OrderItem order = new OrderItem(b, 2);
		
        System.out.println("메뉴: " + order.menu.name);
        System.out.println("단가: " + order.menu.price + "원");
        System.out.println("수량: " + order.quantity + "개");
        System.out.println("총 가격: " + order.getPrice() + "원");
	}

}
