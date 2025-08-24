package Tesda.Exercise;

public class ProgressionPlan24 {
    public static void main(String[] args) {
        int startNumber = 1;
        int commonDifference = 5;
        int n = 10;
        int sum = 0;
        long product = 1;
        
        //arithmetic sequence (sum)
        System.out.print("Sum: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(startNumber);
            
            if (i < n) {
                System.out.print(" + ");
            }
            sum += startNumber;
            startNumber += commonDifference;
        }
        System.out.println(" = " + sum);
        
        startNumber = 1;
        
        //arithmetic sequence (product)
        System.out.print("Product: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(startNumber);
            
            if (i < n) {
                System.out.print(" * ");
            }
            product *= startNumber;
            startNumber += commonDifference;
        }
        System.out.println(" = " + product);
    }
}
