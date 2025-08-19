package Tesda.Activity;

import java.util.Scanner;

public class Activity5_OcampoPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int input;
        
        boolean isValidInput = false;
        System.out.print("Enter the number for the multiplication table you want to display: ");
        
        while (!isValidInput) {
            if (sc.hasNextInt ()) {
                input = sc.nextInt();
                System.out.println("\nMultiplication Table for " + input + ":");

                for (int i = 1; i <= 10; i++) {
                    int product = input * i;
                    System.out.println(input + " x " + i + " = " + product);
                }
                isValidInput = true;
            }
            else {
                System.out.print("Invalid input. Enter a number: ");
                sc.next();
            }
        }
        sc.close();
    }
}
