package Tesda.Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class AdminQuery {
    DBConnection dbConnect;
    Scanner sc;
    
    //constructor
    public AdminQuery(Scanner sc, DBConnection dbConnect) {
        this.sc = sc;
        this.dbConnect = dbConnect;
    }
    
    public void add(int category_id, int type_id, int manufacturer_id, String computer_model, int computer_price, int computer_stock) {
        String query = "INSERT INTO tbcomputer (category_id, type_id, manufacturer_id, computer_model, computer_price, computer_stock) "
            + "VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection connect = dbConnect.connect();
                PreparedStatement prep = connect.prepareStatement(query)) {

            prep.setInt(1, category_id);
            prep.setInt(2, type_id);
            prep.setInt(3, manufacturer_id);
            prep.setString(4, computer_model);
            prep.setInt(5, computer_price);
            prep.setInt(6, computer_stock);
            prep.executeUpdate();

            System.out.println("Product " + computer_model + " added successfully!");
            display();
        }
        catch (Exception e) {
            System.out.println("Add Item: " + e.getMessage());
        }
    }
    
    public void edit(int computer_id, int computer_stock) {
        String query = "UPDATE tbcomputer SET computer_stock = ? WHERE computer_id = ?";
        
        try (Connection connect = dbConnect.connect();
                PreparedStatement prep = connect.prepareStatement(query)){
            
            prep.setInt(1, computer_stock);
            prep.setInt(2, computer_id);
            prep.executeUpdate();
            
            System.out.println("The stock for item " + computer_id + " has been updated successfully!");
            display();            
        } 
        catch (Exception e) {
            System.out.println("Edit Item: " + e.getMessage());
        }
    }
    
    //with IDs only
    public void display() {
        String query = "SELECT * FROM tbcomputer";

        try (Connection connect = dbConnect.connect();
             Statement statement = connect.createStatement();
             ResultSet result = statement.executeQuery(query)) {

            System.out.printf("| %-11s | %-11s | %-8s | %-15s | %-21s | %-9s | %-8s |%n",
                    "Computer ID", "Category ID", "Type ID", "Manufacturer ID", "Model", "Price", "Stock");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
            while (result.next()) {
                int computer_id = result.getInt("computer_id");
                int category_id = result.getInt("category_id");
                int type_id = result.getInt("type_id");
                int manufacturer_id = result.getInt("manufacturer_id");
                String computer_model = result.getString("computer_model");
                String computer_price = result.getString("computer_price");
                String computer_stock = result.getString("computer_stock");

                System.out.printf("| %-11s | %-11s | %-8s | %-15s | %-21s | %-9s | %-8s |%n",
                        computer_id, category_id, type_id, manufacturer_id, computer_model, computer_price, computer_stock);
            }
        }
        catch (Exception e) {
            System.out.println("Display Inventory: " + e.getMessage());
        }
    }
    
    public void search(String computer_search) {
        String query = "SELECT * FROM tbcomputer WHERE computer_model LIKE %?% AND computer_archive = 0";
        
        try (Connection connect = dbConnect.connect();
                PreparedStatement prep = connect.prepareStatement(query)){
            
            prep.setString(1, "%" + computer_search + "%");
            ResultSet result = prep.executeQuery();
            
            System.out.printf("| %-11s | %-11s | %-8s | %-15s | %-30s | %-9s | %-8s |%n",
                    "Computer ID", "Category ID", "Type ID", "Manufacturer ID", "Model", "Price", "Stock");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
            while (result.next()) {
                int computer_id = result.getInt("computer_id");
                int category_id = result.getInt("category_id");
                int type_id = result.getInt("type_id");
                int manufacturer_id = result.getInt("manufacturer_id");
                String computer_model = result.getString("computer_model");
                String computer_price = result.getString("computer_price");
                String computer_stock = result.getString("computer_stock");

                System.out.printf("| %-11s | %-11s | %-8s | %-15s | %-30s | %-9s | %-8s |%n",
                        computer_id, category_id, type_id, manufacturer_id, computer_model, computer_price, computer_stock);
            }          
        } 
        catch (Exception e) {
            System.out.println("Search Item: " + e.getMessage());
        }
    }
    
    public void delete(int computer_id) {
        String query = "DELETE FROM tbcomputer WHERE computer_id = ?";
        
        try (Connection connect = dbConnect.connect();
                PreparedStatement prep = connect.prepareStatement(query)){
            
            prep.setInt(1, computer_id);
            prep.executeUpdate();
            
            System.out.println("The item " + computer_id + " has been deleted successfully!");
            display();            
        } 
        catch (Exception e) {
            System.out.println("Delete Item: " + e.getMessage());
        }
    }
    
    public void archive(int computer_id) {
        String query = "UPDATE tbcomputer SET computer_archive = 1 WHERE computer_id = ?";
        
        try (Connection connect = dbConnect.connect();
                PreparedStatement prep = connect.prepareStatement(query)){
            
            prep.setInt(1, computer_id);
            prep.executeUpdate();
            
            System.out.println("The stock for item " + computer_id + " has been archived successfully!");
            display();            
        } 
        catch (Exception e) {
            System.out.println("Archive Item: " + e.getMessage());
        }
    }
    
    public void restore(int computer_id) {
        String query = "UPDATE tbcomputer SET computer_archive = 0 WHERE computer_id = ?";
        
        try (Connection connect = dbConnect.connect();
                PreparedStatement prep = connect.prepareStatement(query)){
            
            prep.setInt(1, computer_id);
            prep.executeUpdate();
            
            System.out.println("The stock for item " + computer_id + " has been archived successfully!");
            display();            
        } 
        catch (Exception e) {
            System.out.println("Archive Item: " + e.getMessage());
        }
    }
}
