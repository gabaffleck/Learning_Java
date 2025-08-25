package Gemini;

public class SumOfArray {
    public static void main(String[] args) {
        // Declare and initialize an integer array
        int[] numbers = {5, 10, 15, 20, 25, 30};

        // Initialize a variable to store the sum
        int total = 0;

        // Write your for loop here to calculate the sum.
        for (int num : numbers) {
            total += num;
        }
        System.out.println("The sum of the array elements is: " + total);
    }
}
