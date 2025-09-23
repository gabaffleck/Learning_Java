package Tesda.String;

public class CountVowels {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (str.charAt(i) == vowels.charAt(j)) {
                    vowelCount++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowelCount);  
    }
}
