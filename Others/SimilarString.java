package Others;
public class SimilarString {
    public static void main(String[] args) {
        String str1[] = {"S", "K", "G", "A", "Z"};
        String str2[] = {"C", "L", "S", "V", "K"};
        int i, j;

        for (i =0; i <= str1.length; i++) {
            for (j =0; j < str2.length; j++) {
                if(str1[i] == str2[j]) {
                    System.out.println(str1[i]);
                }
            }
            System.out.println();
        }
    }
}
