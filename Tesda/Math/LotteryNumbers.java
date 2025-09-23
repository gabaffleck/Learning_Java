package Tesda.Math;

public class LotteryNumbers {
    public static void main(String[] args) {
        // Step 1: Create a blank int array with a length of 6.
        int[] lotteryNumbers = new int[6];
        
        // The outer loop iterates through each index of the array to fill it.
        for (int i = 0; i < lotteryNumbers.length; i++) {
            // Generate a random number from 1 to 100 (inclusive)
            int randomNumber = (int) (Math.random() * 100) + 1;
            
            // The inner loop checks for duplicates in the part of the array that's already filled.
            for (int j = 0; j < i; j++) {
                // Step 3: Use an if statement to check if the new number is a duplicate.
                if (lotteryNumbers[j] == randomNumber) {
                    // If a duplicate is found, decrement i so this spot in the array is filled again.
                    i--;
                    // The 'break' keyword exits the inner loop to try a new number.
                    break;
                }
            }
            
            // If the inner loop finishes without finding a duplicate, it's a unique number.
            // Assign the unique random number to the current array index.
            lotteryNumbers[i] = randomNumber;
        }

        // Print the unique lottery numbers.
        System.out.print("Your unique lottery numbers are: ");
        for (int number : lotteryNumbers) {
            System.out.print(number + " ");
        }
    }
}
