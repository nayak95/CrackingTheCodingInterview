package Arrays_Strings.Archive;

import java.util.Scanner;

public class palinPermute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPermutationOfPalindrome(str));
    }

    private static boolean isPermutationOfPalindrome(String phrase) {
        int[] table = buildCharFrequency(phrase);
        return checkMaxOneOdd(table);
    }

    private static boolean checkMaxOneOdd(int[] table) {
        boolean found = false;
        for (int count : table){
            if (count % 2 == 1) {
                if (found)
                    return false;
                found = true;
            }
        }
        return true;
    }

    private static int[] buildCharFrequency(String phrase) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

        for(char c: phrase.toCharArray()) {
            int x = getCharValue(c);
            if(x != -1) {
                table[x]++;
            }
        }
        return table;
    }

    private static int getCharValue(char c) {
            int a = Character.getNumericValue('a');
            int z = Character.getNumericValue('z');
            int val = Character.getNumericValue(c);

            if (val >= a && val <= z)
                return val - a;
            return -1;
    }
}
