package Tesda.String;

public class FrequencyLetter {
    public static void main(String[] args) {
        String str = "Hello World";
        char targetLetter = 'o';
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetLetter) {
                frequency++;
            }
        }
        System.out.println("Frequency of '" + targetLetter + "': " + frequency);
    }
}
