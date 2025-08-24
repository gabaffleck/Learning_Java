package Tesda.Exercise;

import java.util.Scanner;

public class StringProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String country = "Philippines";
        // country length is 11
        // P(0) h(1) i(2) l(3) i(4) p(5) p(6) i(7) n(8) e(9) s(10) 
        
        // get the first and last character of a String
        for (int i = 0; i < country.length(); i++) {
            System.out.println("First character of the String is: " + country.charAt(i)); // i = 0
            i = country.length()-1; // i = 10
            System.out.println("Last character of the String is: " + country.charAt(i)); // i = 10
        }
        System.out.println(""); // space
        
        // count the frequency of a character in a String (P/p)
        int count = 0; // initialize count
        for (int i = 0; i < country.length(); i++) {
            if (country.charAt(i) == 'P' || country.charAt(i) == 'p') {
                count++;
            }
        }
        System.out.println("Total count of (P/p) character in the String is: " + count);
        System.out.println(""); // space
        
        // count the no. of vowels in a String
        int vowels = 0; // initialize count
        for (int i = 0; i < country.length(); i++) {
            if (country.charAt(i) == 'A' || country.charAt(i) == 'A') {
                vowels++;
            }
            else if (country.charAt(i) == 'E' || country.charAt(i) == 'e') {
                vowels++;
            }
            else if (country.charAt(i) == 'I' || country.charAt(i) == 'i') {
                vowels++;
            }
            else if (country.charAt(i) == 'O' || country.charAt(i) == 'o') {
                vowels++;
            }
            else if (country.charAt(i) == 'U' || country.charAt(i) == 'u') {
                vowels++;
            }
        }
        System.out.println("Total count of vowels in the String is: " + vowels); 
        sc.close();
    }
}
