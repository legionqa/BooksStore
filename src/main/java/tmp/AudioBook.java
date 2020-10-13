package tmp;

public class AudioBook extends Book{


    int playTime;
    String format;

    public AudioBook(int id, String name, String author, double price, boolean isAvailable, int playTime, String format) {
        super(id, name, author, price, isAvailable);
        this.playTime = playTime;
        this.format = format;
    }

    public int getPlayTime() {
        return playTime;
    }

    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("Format: " + format);
        System.out.println("Playtime in minutes: " + playTime);
    }
}
