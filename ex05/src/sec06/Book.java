package sec06;

public class Book extends LibraryMaterial {
    private int publishedYear;

    public Book(String title, String author) {
        super(title, author);
        this.publishedYear = 2024;
    }

    public Book(String title, String author, int publishedYear) {
        super(title, author);
        this.publishedYear = publishedYear;
    }

    @Override
    public void registerMaterial() {
        System.out.println(title + " ISBN 등록 완료");
    }

    @Override
    public void loanMaterial() {
        System.out.println(title + " 대여 완료");
    }
}
