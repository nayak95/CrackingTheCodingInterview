package Arrays_Strings.Archive;

import java.util.Arrays;
import java.util.Scanner;

public class uniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        System.out.println(str);

        System.out.println(checkUnique(str));
        System.out.println(isUnique(str));


    }

    private static boolean checkUnique(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i -1]) {
                return false;
            }
        }
        return true;
    }
    private static boolean isUnique (String str) {
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            System.out.println(val);
            if (char_set[val])
                return false;
            char_set[val] = true;
        }
        return true;
    }
}
