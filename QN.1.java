public class Main {
    public static void main(String[] args) {
        // Creating an array of integers
        int[] numbers = new int[5];

        // Adding elements to the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Accessing elements in the array
        System.out.println("Element at index 2: " + numbers[2]);

        // Removing an element from the array
        numbers[2] = 0;

        // Accessing the updated array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
