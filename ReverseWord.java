public class ReverseWord {
    public static void main(String[] args) {
        String s = "Gab"; 
        String r = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i); // extracts each character
            r = ch + r; // adds each character in front of the existing string
        }
        System.out.println(r);
    }
}
