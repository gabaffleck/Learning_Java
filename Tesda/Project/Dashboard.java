package Tesda.Project;

import java.util.Scanner;

public class Dashboard {
    DBConnection dbConnect;
    AdminMethods am;
    UserMethods um;
    Scanner sc;
    
    public Dashboard (Scanner sc, DBConnection dbConnect) {
        this.sc = sc;
        this.dbConnect = dbConnect;
        this.am = new AdminMethods (this.sc, this.dbConnect);
        this.um = new UserMethods (this.sc, this.dbConnect);
    }
    
    public void mainMenu () {
        System.out.println("");
        System.out.println("Login as: ");
        System.out.println("[1] Admin");
        System.out.println("[2] User");
        System.out.print("Enter choice: ");
        int access = sc.nextInt();
        sc.nextLine();
        
        switch (access) {
            case 1:
                am.mainMenu();
                break;
            case 2:
                um.mainMenu();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

