package sec06;

public class Magazine extends LibraryMaterial {
    public Magazine(String title, String author) {
        super(title, author);
    }

    @Override
    public void registerMaterial() {
        System.out.println(title + " - 정기 간행물 번호 등록 완료");
    }

    @Override
    public void loanMaterial() {
        System.out.println(title + " 은(는) 최신호 대여 불가");
    }
}
