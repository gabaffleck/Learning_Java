package Tesda.Operators;

public class TernaryOperator {
    public static void main(String[] args) {
        int num = 17;
        
        // if-else-then statement
        // verify if num is odd or even
        
        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println ("Number is " + result);
        System.out.println ("");
        
        boolean output = num % 2 == 0;
        System.out.println ("Is the num an Even number?");
        System.out.println ("Answer: " + output);
    }
}
