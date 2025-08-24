package Tesda.Array;

import java.util.Scanner;

public class NewArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int numberOfRows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int numberOfColumns = sc.nextInt();
        String[][] colors = new String[numberOfRows][numberOfColumns];
        
        sc.nextLine(); //anti bug
        
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                System.out.print("Eneter color[" + i + "][" + j + "]: ");
                colors[i][j] = sc.nextLine();
            }
            System.out.println("");
        }
        
        System.out.println("Printing all the colors:");
        
        for (String[] rows : colors) {
            for (String column : rows) {
                System.out.println(column);
            }
            System.out.println("");
        }
    }
}
