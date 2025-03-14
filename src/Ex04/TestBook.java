package Ex04;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Suoi nguon","Ayn Rand",1000000);
        book.getAuthor();
        book.getPrice();
        book.getTitle();
        book.setAuthor("Hiep");
        book.setTitle("How to deep sleep");
        book.setPrice(500000);
        book.getAuthor();
        book.getPrice();
        book.getTitle();
    }
}
