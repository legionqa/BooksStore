package tmp;

public abstract class Book {

    int id;
    String bookName;
    String authorName;
    double usdPrice;
    boolean isAvailable;
    String bookType;

    String euro = "EUR";
    String ruble = "RUB";

    public Book(int id, String name, String author, double price, boolean isAvailable){
        this.id = id;
        this.bookName = name;
        this.authorName = author;
        this.usdPrice = price;
        this.isAvailable = isAvailable;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getUsdPrice() {
        return usdPrice;
    }

    public void setUsdPrice(double usdPrice) {
        this.usdPrice = usdPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }



    public double calculatePrice(String currency){
        double rate = 1;
        if(currency.equals(euro)){
            rate = 1.1;
        }
        else if (currency.equals(ruble)){
            rate = 70;
        }
        else{
            System.out.println("Error: unknown currency, USD price will be returned");
        }
        double priceAfterConversion = usdPrice * rate;
        return priceAfterConversion;
    }

    public void printBookDetails(){
        System.out.println("*******");
        System.out.println("Book name is: " + bookName);
        System.out.println("Book id is: " + id);
        System.out.println("Book price: " + usdPrice + " USD, " + calculatePrice(euro) +" EUR, " + calculatePrice(ruble) + " RUB");
        System.out.println("Book is available: " + isAvailable);

    }




}
