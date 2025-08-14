package Others;
public class ManualSorting {
    public static void main(String[] args) {
        String str[] = {"S", "K", "G", "A", "Z"};
        String temp;
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
    }
}
