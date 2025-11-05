package sec06;

public class LibraryMain {
    public static void main(String[] args) {
        Book b1 = new Book("수학 잡지", "유빈");
        Book b2 = new Book("과학 잡지", "유빈1", 2008);
        Magazine m1 = new Magazine("국어 잡지", "유빈2");

        Librarian lib1 = new Librarian(b1);
        Librarian lib2 = new Librarian(b2);
        Librarian lib3 = new Librarian(m1);

        lib1.register();
        lib1.loan();

        lib2.register();
        lib2.loan();

        lib3.register();
        lib3.loan();
    }
}
