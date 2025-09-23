package Tesda.Project;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        DBConnection dbConnect = new DBConnection ();
        Dashboard db = new Dashboard (sc, dbConnect);
        
        System.out.println("=====         Welcome to our         =====");
        System.out.println("===== CIS:Computer Inventory System! =====");
        
        db.mainMenu();
    }
}
