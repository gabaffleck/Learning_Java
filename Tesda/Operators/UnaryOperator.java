package Tesda.Operators;

public class UnaryOperator {
    public static void main (String[]args) {
        // negating an expression (-)
        int neg = 5;
        System.out.println (-neg);
        System.out.println (" ");
        
        // inverting the value of a boolean (!)
        boolean inv = true;
        System.out.println (!inv);
        System.out.println (" ");
        
        // incrementing/decrementing a value by one (++/--)
        int num = 5;
        System.out.println (num++);
        System.out.println (num--);
        System.out.println (" ");
        
        // pre-incrementation & post-incrementation
        int num2 = 5;
        int num3 = 5;
        System.out.println (++num2); // adding before number
        System.out.println (num3++); // number before adding
        System.out.println (" ");
        
    }
}
