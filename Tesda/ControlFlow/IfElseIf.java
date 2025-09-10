package Tesda.ControlFlow;

public class IfElseIf {
    public static void main(String[] args) {
        int age = 0;
        
        if (age >= 18) {
            System.out.println("Eligible for National Election");
        }
        else if (age >= 15 && age <= 17) {
            System.out.println("Eligible for SK Election only");
        }
        else if (age <= 14) {
            System.out.println("Not a valid voter yet");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
