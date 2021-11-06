package Arrays_Strings.Archive;

import java.util.Scanner;

public class compressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(compressBad(sc.nextLine()));
        System.out.println(compressOptimal(sc.nextLine()));
    }

    private static String compressBad(String str) {
        String compressedString = "";
        int countConsecutive = 0;
        for (int i=0; i < str.length(); i++) {
            countConsecutive++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressedString += "" + str.charAt(i) + countConsecutive;
                countConsecutive = 0;
            }
        }
        return compressedString.length() < str.length() ? compressedString : str;
    }

    private static String compressOptimal(String str) {
        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;

        for (int i=0; i<str.length(); i++) {
            countConsecutive++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}
