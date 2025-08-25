package Gemini;

public class HalfPyramid {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the half pyramid

        // Write your nested for loops here to print the half pyramid.
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
