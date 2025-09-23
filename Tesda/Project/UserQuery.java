package Tesda.Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UserQuery {
    DBConnection dbConnect;
    Scanner sc;
    
    public UserQuery (Scanner sc, DBConnection dbConnect) {
        this.sc = sc;
        this.dbConnect = dbConnect;
    }
    
    public void display () {
        String query = "SELECT tbmanufacturer.manufacturer_name, tbcomputer.computer_model, tbcomputer.computer_stock, tbcomputer.computer_price "
                + "FROM tbcomputer "
                + "INNER JOIN tbmanufacturer ON tbcomputer.manufacturer_id = tbmanufacturer.manufacturer_id "
                + "WHERE computer_archive = 0";
                
                
        try (Connection connect = dbConnect.connect();
             Statement statement = connect.createStatement();
             ResultSet result = statement.executeQuery(query)) {

            System.out.printf("| %-15s | %-21s | %-9s | %-8s |%n",
                    "Manufacturer", "Model", "Price", "Stock");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
            while (result.next()) {
                String computer_model = result.getString("computer_model");
                String computer_price = result.getString("computer_price");
                String computer_stock = result.getString("computer_stock");
                String manufacturer_name = result.getString ("manufacturer_name");

                System.out.printf("| %-15s | %-21s | %-9s | %-8s |%n",
                        manufacturer_name, computer_model, computer_price, computer_stock);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void search (String computer_search) {
        String query = "SELECT * FROM tbcomputer "
                + "INNER JOIN tbmanufacturer ON tbcomputer.manufacturer_id = tbmanufacturer.manufacturer_id "
                + "WHERE computer_model LIKE ? AND computer_archive = 0";
        
        try (Connection connect = dbConnect.connect();
                PreparedStatement prep = connect.prepareStatement(query)){
            
            prep.setString(1, "%"+ computer_search + "%");
            ResultSet result = prep.executeQuery();
            
            System.out.printf("| %-15s | %-21s | %-9s | %-8s |%n",
                    "Manufacturer", "Model", "Price", "Stock");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
            while (result.next()) {
                String computer_model = result.getString("computer_model");
                String computer_price = result.getString("computer_price");
                String computer_stock = result.getString("computer_stock");
                String manufacturer_name = result.getString ("manufacturer_name");

                System.out.printf("| %-15s | %-21s | %-9s | %-8s |%n",
                    manufacturer_name, computer_model, computer_price, computer_stock);
            }          
        } 
        catch (Exception e) {
            System.out.println("Search Item: " + e.getMessage());
        }
    }
}