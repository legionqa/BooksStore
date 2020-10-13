package tmp;

public class BooksStoreMain {
    public static void main(String[] args) {
        AudioBook book1 = new AudioBook(1, "Harry Potter", "J.K Rowling", 10.5, false, 10, "mp3");
        EBook book2 = new EBook(2, "Anna Karenina", "L. Tolstoy",  20, true, 500);

        book2.setUsdPrice(30);
        System.out.println(book2.calculatePrice("euro"));
        book1.setAvailable(true);

        book1.printBookDetails();
        book2.printBookDetails();

    }
}
