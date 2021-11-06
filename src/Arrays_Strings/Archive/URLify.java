package Arrays_Strings.Archive;

import java.util.Scanner;

public class URLify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int trueLength = sc.nextInt();
        replaceSpace(str, trueLength);
        System.out.println(str);
    }

    private static void replaceSpace(String str, int trueLength) {
        char[] arr = str.toCharArray();
        int spaceCount = 0, index;
        for (char c : arr) {
            if(c == ' ')
                spaceCount++;
        }
        index = trueLength + spaceCount*2;

        if (trueLength < str.length()) arr[trueLength] = '\0';

        for (int i = str.length() - 1; i >= 0 ; i--) {
            if (arr[i] == ' ') {
                arr[index - 1] = '0';
                arr[index - 2] = '2';
                arr[index - 3] = '%';
                index -= 3;
            } else {
                arr[index - 1] = arr[i];
                index--;
            }
        }
    }
}
