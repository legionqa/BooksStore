package BooksStoreOOP;

public class PrintedBook {
    public static void main(String[] args) {
        String abc = "123456789999";
        test(abc);
    }

    public static void test(String txt){
        for ( int i =0; i<=txt.length()-4; i++){
            System.out.println();           int max = Character.getNumericValue(txt.charAt(i)) * Character.getNumericValue(txt.charAt(i+1))* Character.getNumericValue(txt.charAt(i+2))*Character.getNumericValue(txt.charAt(i+3));
            System.out.println(max);


        }

    }

}
