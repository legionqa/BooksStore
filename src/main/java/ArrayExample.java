public class ArrayExample {

    //check if array contains 2

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        arrayExample.filterArray(intArray);
    }


    public boolean filterArray(int[] intArray) {
        // Declaring array literal
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element at index " + i + " : " + intArray[i]);

            if (intArray[i] == 2) {

                System.out.println("array contains 2 after 2");
                return true;
            }
        }
        System.out.println("array does not contain 2 after 2");

        return false;

    }
}

