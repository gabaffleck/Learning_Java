package Tesda.Looping;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String regUsername = "admin";
        String regPassword = "admin";
        
        boolean credential = false;
        while (!credential) {
            System.out.println("Username");
            String username = sc.nextLine();
            System.out.println(" ");
            System.out.println("Password");
            String password = sc.nextLine();
            System.out.println(" ");
            
            if (regUsername.equals(username) && regPassword.equals(password)) {
                System.out.println("Logged in successfully");
                System.out.println(" ");
                credential = true;
            }
            else {
                System.out.println("Invalid username or password");
                System.out.println(" ");
            }
            
        }
    }
}
