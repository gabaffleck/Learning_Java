package Tesda.Activity;

import java.util.Scanner;

public class Activity3_Ocampo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();
        
        if (age >= 60) {
            System.out.println("Senior");
        }
        else if (age >= 30 && age <= 59) {
            System.out.println("Adult");
        }
        else if (age >= 20 && age <= 29) {
            System.out.println("Young Adult");
        }
        else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        }
        else if (age >= 3 && age <= 12) {
            System.out.println("Child");
        }
        else if (age >= 0 && age <= 2) {
            System.out.println("Baby");
        }
        else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}
