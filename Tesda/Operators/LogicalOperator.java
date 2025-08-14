package Tesda.Operators;

public class LogicalOperator {
    public static void main(String[] args) {
        int age = 17;
        
        // and (&&)
        // both statement needs to be true
        // no longer checks second condition if first condition is false
        boolean legal = age > 18 && age == 18;
        System.out.println ("Is the person in legal age? Answer: " + legal);
        
        // or (||)
        // one statement needs to be true
        // no longer checks second condition if first condition is true
        boolean minor = age < 18 || age >= 18;
        System.out.println ("Is the person a minor? Answer: " + minor);
        
    }
}
