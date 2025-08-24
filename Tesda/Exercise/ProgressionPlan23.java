package Tesda.Exercise;

public class ProgressionPlan23 {
    public static void main(String[] args) {
        int startNumber = 1;
        int commonDifference = 5;
        int n = 5;
        int sum = 0;
        
        //arithmetic sequence (sum only)
        for (int i = 1; i <= n; i++) {
            System.out.print(startNumber);
            
            if (i < n) {
                System.out.print(" + ");
            }
            sum += startNumber;
            startNumber += commonDifference;
            
        }
        System.out.println(" = " + sum);
    }
}
