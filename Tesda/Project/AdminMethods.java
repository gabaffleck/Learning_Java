package Tesda.Project;

import java.util.Scanner;

public class AdminMethods {
    DBConnection dbConnect;
    AdminQuery aq;
    Scanner sc;
    
    public AdminMethods (Scanner sc, DBConnection dbConnect) {
        this.sc = sc;
        this.dbConnect = dbConnect;
        this.aq = new AdminQuery (this.sc, this.dbConnect);
    }
    
    public void mainMenu() {
        while (true) {
            System.out.println("");
            System.out.println("===== WELCOME ADMIN! =====");
            System.out.println("");
            System.out.println("SELECT INVENTORY OPERATION");
            System.out.println("[1] Add     [5] Delete");
            System.out.println("[2] Edit    [6] Archive");
            System.out.println("[3] Display [7] Restore");
            System.out.println("[4] Search  [8] Exit");
            System.out.print("Enter choice: ");
            int adminMainMenuChoice = sc.nextInt();
            sc.nextLine();
            
            switch (adminMainMenuChoice) {
                case 1:
                    addMenu();
                    followup();
                    break;
                case 2:
                    edit();
                    followup();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    search();
                    followup();
                    break;
                case 5:
                    delete();
                    followup();
                    break;
                case 6:
                    archive();
                    followup();
                    break;
                case 7:
                    restore();
                    followup();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    
    public void addMenu() {
        System.out.println("");
        System.out.println("===== ADD PRODUCT =====");
        System.out.println("");
        System.out.println("SELECT CATEGORY");
        System.out.println("[1] Peripherals");
        System.out.println("[2] Components");
        System.out.print("Enter choice: ");
        int category_id = sc.nextInt();
        sc.nextLine();

        switch (category_id) {
            case 1:
                addPeripherals();
                followup();
                break;
            case 2:
                addComponents();
                followup();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    
    public void addPeripherals() {
        System.out.println("");
        System.out.println("===== ADD PERIPHERAL PRODUCT =====");
        System.out.println("");
        System.out.println("SELECT PERIPHERAL TYPE");
        System.out.println("[1] Keyboard [4] Printer");
        System.out.println("[2] Mouse    [5] Webcam");
        System.out.println("[3] Monitor  [6] Speakers");
        System.out.print("Enter choice: ");
        int type_id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("");
        System.out.println("SELECT MANUFACTURER");
        System.out.println("[1] AMD      [7] Logitech");
        System.out.println("[2] ASUS     [8] MSI");
        System.out.println("[3] Corsair  [9] NVIDIA");
        System.out.println("[4] Gigabyte [10] Razer");
        System.out.println("[5] Intel    [11] Samsung");
        System.out.println("[6] Kingston [12] Seagate");
        System.out.print("Enter choice: ");
        int manufacturer_id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("");
        System.out.print("ENTER MODEL: ");
        String computer_model = sc.nextLine();
        
        System.out.println("");
        System.out.print("ENTER PRICE: ");
        int computer_price = sc.nextInt();
        sc.nextLine();
        
        System.out.println("");
        System.out.print("ENTER STOCK: ");
        int computer_stock = sc.nextInt();
        sc.nextLine();

        aq.add(1, type_id, manufacturer_id, computer_model, computer_price, computer_stock);
    }
    
    public void addComponents() {
        System.out.println("");
        System.out.println("===== ADD COMPONENT PRODUCT =====");
        System.out.println("");
        System.out.println("SELECT PERIPHERAL TYPE");
        System.out.println("[1] CPU [4] RAM");
        System.out.println("[2] GPU [5] Storage");
        System.out.println("[3] PSU [6] Motherboard");
        System.out.print("Enter choice: ");
        int type_id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("");
        System.out.println("SELECT MANUFACTURER");
        System.out.println("[1] AMD      [7] Logitech");
        System.out.println("[2] ASUS     [8] MSI");
        System.out.println("[3] Corsair  [9] NVIDIA");
        System.out.println("[4] Gigabyte [10] Razer");
        System.out.println("[5] Intel    [11] Samsung");
        System.out.println("[6] Kingston [12] Seagate");
        System.out.print("Enter choice: ");
        int manufacturer_id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("");
        System.out.print("ENTER MODEL: ");
        String computer_model = sc.nextLine();
        
        System.out.println("");
        System.out.print("ENTER PRICE: ");
        int computer_price = sc.nextInt();
        sc.nextLine();
        
        System.out.println("");
        System.out.print("ENTER STOCK: ");
        int computer_stock = sc.nextInt();
        sc.nextLine();

        aq.add(2, type_id, manufacturer_id, computer_model, computer_price, computer_stock);
    }
     
    public void edit() {
        System.out.println("");
        System.out.println("===== EDIT PRODUCT =====");
        System.out.println("");
        System.out.println("ENTER ITEM ID");
        System.out.print("Enter ID: ");
        int computer_id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("");
        System.out.println("ENTER ITEM'S NEW STOCK");
        System.out.print("Enter ID: ");
        int computer_stock = sc.nextInt();
        sc.nextLine();

        aq.edit(computer_id, computer_stock);
    }
    
    public void display() {
        aq.display();
        followup();
    }
    
    public void search() {
        System.out.println("");
        System.out.println("===== SEARCH PRODUCT =====");
        System.out.println("");
        System.out.println("ENTER COMPUTER MODEL");
        System.out.print("Enter text: ");
        String computer_search = sc.nextLine();
        
        aq.search(computer_search);
    }
    
    public void delete() {
        System.out.println("");
        System.out.println("===== DELETE PRODUCT =====");
        System.out.println("");
        System.out.println("ENTER ITEM ID");
        System.out.print("Enter ID: ");
        int computer_id = sc.nextInt();
        sc.nextLine();
        
        aq.delete(computer_id);
    }
    
    public void archive() {
        System.out.println("");
        System.out.println("===== ARCHIVE PRODUCT =====");
        System.out.println("");
        System.out.println("ENTER ITEM ID");
        System.out.print("Enter ID: ");
        int computer_id = sc.nextInt();
        sc.nextLine();
        
        aq.archive(computer_id);
    }
    
    public void restore() {
        System.out.println("");
        System.out.println("===== RESTORE PRODUCT =====");
        System.out.println("");
        System.out.println("ENTER ITEM ID");
        System.out.print("Enter ID: ");
        int computer_id = sc.nextInt();
        sc.nextLine();
        
        aq.restore(computer_id);
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
