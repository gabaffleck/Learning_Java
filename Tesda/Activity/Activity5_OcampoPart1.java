package Tesda.Activity;

public class Activity5_OcampoPart1 {
    public static void main(String[] args) {
        
        for (int i = 1; i < 11; i++) {
            System.out.println("");
            System.out.println("Multiplication Table of " + i);
            for (int j = 1; j < 11; j++) {
                int product = i * j;
                System.out.print(i + " * " + j + " = " + product);
                System.out.println("");
                
            }
        }
    }
}
