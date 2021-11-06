package Arrays_Strings.Ques2;

import java.util.Arrays;

public class Solution {
    private static String sort(String sort){
        char[] arr = sort.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static boolean checkPermutationBySort (String s, String t){
        if(s.length() != t.length())    return false;
        return sort(s).equals(sort(t));
    }


}
