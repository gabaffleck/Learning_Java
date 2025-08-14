package Tesda.Operators;

public class RelationalOperator {
    public static void main (String[]args) {
        int num1 = 12;
        int num2 = 5;
        
        //comparison
        
        // less than (<)
        boolean one = num1 < num2;
        System.out.println (one);
        
        // greater than (>)<= ,>=
        boolean two = num1 > num2;
        System.out.println (two);
        
        // less than or equal to (<=)
        boolean three = num1 <= num2;
        System.out.println (three);
        
        // greater than or equal to (>=)
        boolean four = num1 >= num2;
        System.out.println (four);
        
        // equality
        
        // is equal to (==)
        boolean five = num1 == num2;
        System.out.println (five);
        
        // is not equal to (!=)
        boolean six = num1 != num2;
        System.out.println (six);

    }
}
