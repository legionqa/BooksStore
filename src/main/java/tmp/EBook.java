package tmp;

public class EBook extends Book{
    int fileSize;


    public EBook(int id, String name, String author, double price, boolean isAvailable, int fileSize) {
        super(id, name, author, price, isAvailable);
        this.fileSize = fileSize;
    }

    @Override
    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("FileSize: " + fileSize + " kb.");
    }
}
