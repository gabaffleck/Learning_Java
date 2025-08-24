package Tesda.Exercise;

public class ProgressionPlan21 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        
        //exercise 2.1
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            // sum = 0 + 1 = 1
            // sum = 1 + 2 = 3
            // sum = 3 + 3 = 6
            // sum = 6 + 4 = 10
            // sum = 10 + 5 = 15
            System.out.println("i = " + i + ", sum = " + sum); 
        }
        System.out.println("Final sum: " + sum);
        System.out.println("");
    }
}
