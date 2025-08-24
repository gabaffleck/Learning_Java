package Tesda.Exercise;

public class ProgressionPlan22 {
    public static void main(String[] args) {
        int n = 5;
        int product = 1;

        //exercise 2.2
        for (int i = 1; i <= n; i++) {
            product = product * i;
            // product = 1 * 1 = 1
            // product = 1 * 2 = 2
            // product = 2 * 3 = 6
            // product = 6 * 4 = 24
            // product = 24 * 5 = 120
            System.out.println("i = " + i + ", product = " + product); 
        }
        System.out.println("Final product: " + product);
        System.out.println("");
    }
}
