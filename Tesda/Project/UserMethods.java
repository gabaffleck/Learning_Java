package Tesda.Project;

import java.util.Scanner;

public class UserMethods {
    DBConnection dbConnect;
    UserQuery uq;
    Scanner sc;
    
    public UserMethods (Scanner sc, DBConnection dbConnect) {
        this.sc = sc;
        this.dbConnect = dbConnect;
        this.uq = new UserQuery (this.sc, this.dbConnect);
    }
    
    public void mainMenu() {
        System.out.println("");
        System.out.println("===== WELCOME USER! =====");
        System.out.println("");
        System.out.println("SELECT OPERATION");
        System.out.println("[1] Display Available Items");
        System.out.println("[2] Search Item");
        System.out.print("Enter choice: ");
        int mainMenuChoice = sc.nextInt();
        sc.nextLine();

        switch (mainMenuChoice) {
            case 1:
                display();
                break;
            case 2:
                search();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    
    public void display() {
        uq.display();
        followup();
    }
    
    public void search () {
        System.out.println("");
        System.out.println("===== SEARCH PRODUCT =====");
        System.out.println("");
        System.out.println("ENTER COMPUTER MODEL");
        System.out.print("Enter text: ");
        String computer_search = sc.nextLine();
        
        uq.search(computer_search);
        followup();
    }
    
    public void followup() {
        System.out.println("");
        System.out.println("Do you want to perform another operation?");
        System.out.println("\t[Y] Yes");
        System.out.println("\t[N] No/Exit");
        System.out.print("Enter choice: ");
        String followupChoice = sc.nextLine();

        if (followupChoice.equalsIgnoreCase("Y")) {
            mainMenu();
        }
        else if (followupChoice.equalsIgnoreCase("N")) {
            System.out.println();
            System.out.println("Thank you for using CIS!");
            System.exit(0);
        }
        else {
            System.out.println("Invalid input");
        }  
    }
}
