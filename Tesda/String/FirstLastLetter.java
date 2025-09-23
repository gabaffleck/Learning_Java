package Tesda.String;

public class FirstLastLetter {
    public static void main(String[] args) {
        String str = "Hello World";
        char firstLetter = str.charAt(0);
        char lastLetter = str.charAt(str.length() - 1);

        System.out.println("First letter: " + firstLetter);
        System.out.println("Last letter: " + lastLetter);
    }
}
