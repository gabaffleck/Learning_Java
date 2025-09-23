package Tesda.Math;

public class Bingo {
    public static void main(String[] args) {
        // Create a 2D array to represent the 5x5 Bingo card.
        int[][] bingoCard = new int[5][5];
        
        // Use a boolean array to keep track of generated numbers to avoid duplicates.
        // The range is 1-75. We need an extra slot for the 0 index.
        boolean[] usedNumbers = new boolean[76];
        
        // Loop through each column (B, I, N, G, O).
        for (int col = 0; col < 5; col++) {
            // Loop through each row in the current column.
            for (int row = 0; row < 5; row++) {
                // Generate a random number within the correct range for the column.
                int randomNumber;
                
                // Keep generating a number until it's not a duplicate.
                do {
                    // Each column has a specific range of 15 numbers.
                    // B: 1-15, I: 16-30, N: 31-45, G: 46-60, O: 61-75
                    randomNumber = (int) (Math.random() * 15) + 1 + (col * 15);
                } while (usedNumbers[randomNumber]); // Check if the number is already used.
                
                // Once a unique number is found, mark it as used.
                usedNumbers[randomNumber] = true;   
                
                // Assign the unique number to the Bingo card.
                bingoCard[row][col] = randomNumber;
            }
        } 
        
        // Print the Bingo card in a clear, formatted way.
        System.out.println("B\tI\tN\tG\tO");
        System.out.println("-------------------------");
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                // Use a tab (\t) for spacing.
                System.out.print(bingoCard[row][col] + "\t");
            }
            System.out.println(); // Move to the next line after each row.
        }
    }
}
