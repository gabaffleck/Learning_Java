package Tesda.Activity;

import java.util.Scanner;

public class Activity4_Ocampo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");
        String dial = sc.nextLine();
        
        if (dial.equals("*143#")) {
            
            System.out.println("");
            System.out.println("* Load Registration *");
            System.out.println("    [1] Go+");
            System.out.println("    [2] SuperGo99");
            System.out.println("    [3] GoEXTRA");
            System.out.println("    [4] UNLI 5G");
            System.out.println("    [5] Exit");
            System.out.print("Enter a choice: ");
            String choice = sc.nextLine();
            
            switch (choice) {
                
                case "1":
                    
                    System.out.println("");
                    System.out.println("*** Go+ Promos ***");
                    System.out.println("    [1] Go+99");
                    System.out.println("    [2] Go+129");
                    System.out.println("    [3] Exit");
                    System.out.print("Enter a choice: ");
                    String goPlusChoice = sc.nextLine();
                    
                    switch (goPlusChoice) {
                        
                        case "1":
                            
                            System.out.println("");
                            System.out.println("    Get 8GB for all sites + 8GB for 5G OR\n" +
                                               "    apps + unli allnet texts for 7 days,\n" +
                                               "    plus a FREE voucher. Register via GlobeOne\n" +
                                               "    to earn 1.98 Globe Rewards");
                            System.out.println("    [1] Subscribe");
                            System.out.println("    [2] Exit");
                            System.out.print("Enter a choice: ");
                            String goPlusOne = sc.nextLine();
                            
                            switch (goPlusOne) {
                                
                                case "1":
                                    
                                    System.out.println("");
                                    System.out.println("Congrats! You are now subscribed with Go+99");
                                break;
                                    
                                case "2":
                                    
                                    System.out.println("");
                                    System.out.println("Thank you for using Load Registration");
                                break;
                                    
                                default:
                                    
                                    System.out.println("");
                                    System.out.println("Invalid choice, Run the program again");
                                    System.out.println("            Goodbye");
                            }
                        break;
                            
                        case "2":
                            
                            System.out.println("");
                            System.out.println("    Get up to 18GB total data! 10GB for all\n" +
                                               "    sites + 8GB for 5G or apps + unli allnet\n" +
                                               "    texts + unli calls to Globe/TM + a FREE\n" +
                                               "    voucher. Valid for 7 days.");
                            System.out.println("    [1] Subscribe");
                            System.out.println("    [2] Exit");
                            System.out.print("Enter a choice: ");
                            String goPlusTwo = sc.nextLine();
                            
                            switch (goPlusTwo) {
                                
                                case "1":
                                    
                                    System.out.println("");
                                    System.out.println("Congrats! You are now subscribed with Go+129");
                                break;
                                    
                                case "2":
                                    
                                    System.out.println("");
                                    System.out.println("Thank you for using Load Registration");
                                break;
                                    
                                default:
                                    
                                    System.out.println("");
                                    System.out.println("Invalid choice, Run the program again");
                                    System.out.println("            Goodbye");
                            }
                        break;
                            
                        case "3":
                            
                            System.out.println("");
                            System.out.println("Thank you for using Load Registration");
                        break;
                        
                        default:
                                    
                            System.out.println("");
                            System.out.println("Invalid choice, Run the program again");
                            System.out.println("            Goodbye");
                    }
                break;
                
                case "2":
                    System.out.println("");
                    System.out.println("    Enjoy data for 15 days with GoDeals!\n" +
                                       "    SuperGo99 comes with 7GB for all sites\n" +
                                       "    + unli all-net texts, valid for 15 days.\n" + 
                                       "    Register via GlobeOne to earn 1.98 points.");
                    System.out.println("    [1] Subscribe");
                    System.out.println("    [2] Exit");
                    System.out.print("Enter a choice: ");
                    String superGoNineNine = sc.nextLine();

                    switch (superGoNineNine) {

                        case "1":

                            System.out.println("");
                            System.out.println("Congrats! You are now subscribed with SuperGo99");
                        break;

                        case "2":

                            System.out.println("");
                            System.out.println("Thank you for using Load Registration");
                        break;

                        default:

                            System.out.println("");
                            System.out.println("Invalid choice, Run the program again");
                            System.out.println("            Goodbye");
                    }
                break;
                
                case "3":
                    
                    System.out.println("");
                    System.out.println("*** GoEXTRA Promos ***");
                    System.out.println("    [1] GoEXTRA99");
                    System.out.println("    [2] GoEXTRA199");
                    System.out.println("    [3] Exit");
                    System.out.print("Enter a choice: ");
                    String goExtraChoice = sc.nextLine();
                    
                    switch (goExtraChoice) {
                        
                        case "1":
                            
                            System.out.println("");
                            System.out.println("    Go all-in with GoEXTRA99! Get 8GB for all sites, unli all-\n" +
                                               "    net calls & texts, valid for 7 days, for only P99");
                            System.out.println("    [1] Subscribe");
                            System.out.println("    [2] Exit");
                            System.out.print("Enter a choice: ");
                            String goExtraOne = sc.nextLine();
                            
                            switch (goExtraOne) {
                                
                                case "1":
                                    
                                    System.out.println("");
                                    System.out.println("Congrats! You are now subscribed with GoEXTRA99");
                                break;
                                    
                                case "2":
                                    
                                    System.out.println("");
                                    System.out.println("Thank you for using Load Registration");
                                    break;
                                    
                                default:
                                    
                                    System.out.println("");
                                    System.out.println("Invalid choice, Run the program again");
                                    System.out.println("            Goodbye");
                            }
                            break;
                            
                        case "2":
                            
                            System.out.println("");
                            System.out.println("    Go all-in for 15 days with GoEXTRA199! Get 8GB for all\n" +
                                               "    sites, unli all-net calls & texts, valid for 15 days, for\n" +
                                               "    only P199");
                            System.out.println("    [1] Subscribe");
                            System.out.println("    [2] Exit");
                            System.out.print("Enter a choice: ");
                            String goExtraTwo = sc.nextLine();
                            
                            switch (goExtraTwo) {
                                
                                case "1":
                                    
                                    System.out.println("");
                                    System.out.println("Congrats! You are now subscribed with GoEXTRA199");
                                    break;
                                    
                                case "2":
                                    
                                    System.out.println("");
                                    System.out.println("Thank you for using Load Registration");
                                    break;
                                    
                                default:
                                    
                                    System.out.println("");
                                    System.out.println("Invalid choice, Run the program again");
                                    System.out.println("            Goodbye");
                            }
                        break;
                            
                        case "3":
                            
                            System.out.println("");
                            System.out.println("Thank you for using Load Registration");
                        break;
                        
                        default:
                                    
                            System.out.println("");
                            System.out.println("Invalid choice, Run the program again");
                            System.out.println("            Goodbye");
                    }
                break;
                
                case "4":
                    
                    System.out.println("");
                    System.out.println("*** UNLI 5G Promos ***");
                    System.out.println("    [1] UNLI 5G 50");
                    System.out.println("    [2] UNLI 5G 80");
                    System.out.println("    [3] Exit");
                    System.out.print("Enter a choice: ");
                    String goUnliChoice = sc.nextLine();
                    
                    switch (goUnliChoice) {
                        
                        case "1":
                            
                            System.out.println("");
                            System.out.println("    Feel the unlimited 5G experience with UNLI5G 50! Get unli\n" +
                                               "    5G data + 2GB data for all sites, valid for 2 days for only P50.");
                            System.out.println("    [2] Exit");
                            System.out.print("Enter a choice: ");
                            String goUnliOne = sc.nextLine();
                            
                            switch (goUnliOne) {
                                
                                case "1":
                                    
                                    System.out.println("");
                                    System.out.println("Congrats! You are now subscribed with UNLI 5G 50");
                                break;
                                    
                                case "2":
                                    
                                    System.out.println("");
                                    System.out.println("Thank you for using Load Registration");
                                    break;
                                    
                                default:
                                    
                                    System.out.println("");
                                    System.out.println("Invalid choice, Run the program again");
                                    System.out.println("            Goodbye");
                            }
                            break;
                            
                        case "2":
                            
                            System.out.println("");
                            System.out.println("    Feel the unlimited 5G experience with UNLI 5G data + 2GB\n" +
                                               "    data for all sites + unli allnet calls & texts, valid for\n" +
                                               "    2 days for only P80.");
                            System.out.println("    [1] Subscribe");
                            System.out.println("    [2] Exit");
                            System.out.print("Enter a choice: ");
                            String goUnliTwo = sc.nextLine();
                            
                            switch (goUnliTwo) {
                                
                                case "1":
                                    
                                    System.out.println("");
                                    System.out.println("Congrats! You are now subscribed with UNLI 5G 80");
                                    break;
                                    
                                case "2":
                                    
                                    System.out.println("");
                                    System.out.println("Thank you for using Load Registration");
                                    break;
                                    
                                default:
                                    
                                    System.out.println("");
                                    System.out.println("Invalid choice, Run the program again");
                                    System.out.println("            Goodbye");
                            }
                        break;
                            
                        case "3":
                            
                            System.out.println("");
                            System.out.println("Thank you for using Load Registration");
                        break;
                        
                        default:
                                    
                            System.out.println("");
                            System.out.println("Invalid choice, Run the program again");
                            System.out.println("            Goodbye");
                    }
                break;
                    
                case "5":
                    
                    System.out.println("");
                    System.out.println("Thank you for using Load Registration");
                    break;
                    
                default:
                    
                    System.out.println("");
                    System.out.println("Invalid choice, Run the program again");
                    System.out.println("            Goodbye");
            }
            
        }
        else {
            
            System.out.println("");
            System.out.println("Invalid dial, Run the program again");
            System.out.println("            Goodbye");
        }
        sc.close();
    }
}
