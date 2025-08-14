package Tesda.Activity;

public class Activity2_Ocampo {
    public static void main(String[] args) {
        System.out.println("Let say the number is 10");
        System.out.println("");
        int num = 10;
        
        String result = (num % 2 == 0)?
                ("true\n" + num) : ("false" + num++);
        System.out.println(result);
        System.out.println("");
        
        System.out.println("Let say the number is 11");
        System.out.println("");
        int num2 = 11;
        
        String result2 = (num2 % 2 == 0)?
                ("True and the number is " + num2) : ("false\n" + ++num2);
        System.out.println(result2);

    }
}
