package Introduction;
import static java.lang.Math.*;

public class Mathematics {
    public static void main(String[] args) {
        int x = 25;
        int y = 36;
        int randomNum = (int) (Math.random() * 100);

        System.out.println("Highest value of x and y is :" + Math.max(x, y));
        System.out.println("Lowest value of x and y is :" + Math.min(x, y));
        System.out.println("Square root of x is :" + Math.sqrt(x));
        System.out.println("Absolute value of y is :" + Math.abs(y));
        System.out.println("Random number is :" + randomNum);

    }
    
}
