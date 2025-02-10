public class Strings {
    public static void main(String[] args) { 
        String big = "HELLO";
        String small = "world";

        System.out.println("Uppercase to lowercase of " + big + " is " + big.toLowerCase());
        System.out.println("Lowercase to uppercase of " + small + " is " + small.toUpperCase());
        System.out.println("Concantenation of " + big + " and " + small + " is " + big.concat(small));
    }
}
