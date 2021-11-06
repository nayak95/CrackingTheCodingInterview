package Arrays_Strings.Archive;

import java.util.Arrays;
import java.util.Scanner;

public class palindromePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPermutationOfPalindrome(str));
        System.out.println(isPermutationOfPalindromeOptimal(str));
    }

    private static boolean isPermutationOfPalindromeOptimal(String phrase) {
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1){
                table[x]++;
                if (table[x] % 2 == 1)
                    countOdd++;
                else
                    countOdd--;
            }
        }
        return countOdd <= 1;
    }

    private static boolean isPermutationOfPalindrome(String phrase) {
        int[] table = buildCharFrequency(phrase);
        return checkMaxOneOdd(table);
    }

    private static boolean checkMaxOneOdd(int[] table) {
        boolean found = false;
        System.out.println(Arrays.toString(table));
        for (int count : table) {
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
        for ( char c: phrase.toCharArray() ) {
            int x = getCharNumber(c);
            if (x != -1)
                table[x]++;
        }
        return table;
    }

    private static int getCharNumber(char c) {
        int a = Character.getNumericValue('a'), z = Character.getNumericValue('z');
        return (Character.getNumericValue(c) >= a && Character.getNumericValue(c) <= z) ? Character.getNumericValue(c) - a : -1;
//        int val = Character.getNumericValue(c);
//        if ( val >= a && val <= z )
//            return val - a;
//        return -1;
    }
}
