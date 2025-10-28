package ex04;

public class ToppingPizza extends Pizza {
	String topping;
	
	public ToppingPizza() {}
	
	public ToppingPizza(String dough, int sizelnlnch, String topping) {
		super(dough, sizelnlnch);
		this.topping = topping;
	}
	
	@Override
	public void describe() {
		System.out.printf("%s Pizza: %d 인치, %s를 사용한 기본 피자입니다. 주요 토핑은 **%s** 입니다.\n",topping ,sizelnlnch, dough, topping);
	}
	@Override
	public void bake() {
		System.out.printf("%s Pizza(표준): 오븐에 표준 시간 동안 피자를 굽습니다.",topping);
	}
	public void bake(int minute) {
		System.out.printf("%s Pizza(시간 지정): %d 분 동안 특별히 피자를 굽습니다.",topping, minute);
	}
	public void bake(int minute, int temperature) {
		System.out.printf("%s Pizza(온도+시간 지정): %d 도에서 %d 분 동안 **%s** 피자를 완벽하세요 굽습니다.\n",topping, temperature, minute, topping);
	}
}
