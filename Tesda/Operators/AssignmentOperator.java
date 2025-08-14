package Tesda.Operators;

public class AssignmentOperator {
    public static void main (String[]args) {
        int num1 = 12;
        int num2 = 5;
        
        // equals (=)
        System.out.println ("num1 is " + num1);
        System.out.println ("num2 is " + num2);
        
        // addition (+=)
        // num1 = num1 + num1
        num1 += num1;
        System.out.println (num1);
        
        // substraction (-=)
        // num1 = num1 - num1
        num1 -= num1;
        System.out.println (num1);
    }
}
