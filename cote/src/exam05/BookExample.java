package exam05;

public class BookExample {
    public static void main(String[] args) {
        Book[] book = new Book[3];

        String[] title = {"너의 이름은", "날씨의 아이", "스즈메의 문단속"};
        String author = "신카이 마코토";
        String[] isbn = {"123-4-56-7890", "123-4-56-7890", "123-4-56-7890"};
        int[] price = {15000, 14000, 13000};

        for (int i = 0; i < 3; i++) {
        	  book[i] = new Book(title[i], author, isbn[i], price[i]);
        }
    }
}