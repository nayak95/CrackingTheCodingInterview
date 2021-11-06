package Arrays_Strings.Archive;

import java.util.Arrays;
import java.util.Scanner;

public class permuteStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine(), str2 = sc.nextLine();
        System.out.println(checkPermute(str1, str2));
        System.out.println(checkPermute1(str1, str2));
    }

    private static boolean checkPermute1(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        int[] letters = new int[128];

        char[] arr = str1.toCharArray();
        for (char c: arr) {
            System.out.println(c);
            letters[c]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            int c = str2.charAt(i);
            letters[c]--;
            if (letters[c] < 0)
                return false;
        }
        return true;
    }

    private static boolean checkPermute(String str1, String str2) {
        char[] arr1 = str1.toCharArray(), arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }



}
