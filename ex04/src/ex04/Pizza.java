package ex04;

public class Pizza {
	public String dough;
	public int sizelnlnch;
	
	public Pizza () {}
	
	public Pizza(String dough, int sizelnlnch) {
		this.dough = dough;
		this.sizelnlnch = sizelnlnch;
	}
	
	public void bake() {
		System.out.println("Plain Pizza: 오븐에서 표준 시간 동안 피자를 굽습니다.");
	}
	public void bake(int minute) {
		System.out.printf("Plain Pizza %d 분 동안 특별히 피자를 굽습니다.", minute);
	}
	public void describe() {
		System.out.printf("Plain Pizza: %d 인치, 씬 %s를 사용한 기본 피자입니다.\n", sizelnlnch, dough);
	}
}