package Tesda.ControlFlow;

import java.util.Scanner;

public class WithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); //calss instantiation
        int age = sc.nextInt();
        
        if (age >= 18) {
            System.out.println("Eligible for National Election");
        }
        else if (age >= 15 && age <= 17) {
            System.out.println("Eligible for SK Election only");
        }
        else if (age <= 14) {
            System.out.println("Not a valid voter yet");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
