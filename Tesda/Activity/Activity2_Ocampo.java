package Tesda.Activity;

public class Activity2_Ocampo {
    public static void main(String[] args) {
        int num = 10;
        
        System.out.println("Is num an even number?");
        boolean isEven = (num % 2 == 0);
        System.out.println(isEven);
        System.out.println(num);
        System.out.println();

        System.out.println("Is num an odd number?");
        boolean isOdd = !(num % 2 == 0);
        System.out.println(isOdd); 
        num++;
        System.out.println(num);
    }
}
