package Arrays_Strings.Ques1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ques1 {
    public static boolean isUniqueCharsMap(String strs){
        if (strs.length() == 1)
            return true;

        Map<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < strs.length(); i++) {
//            System.out.println((int)strs.charAt(i));
            if(map.containsKey(strs.charAt(i)))
                return false;
            map.put(strs.charAt(i), true);
        }
        return true;
    }

    private static boolean isUniqueChars(String strs){
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < strs.length(); i++) {
            if (char_set[strs.charAt(i)])
                return false;
            char_set[strs.charAt(i)] = true;
        }
        return true;
    }

    private static boolean isUniqueCharsSort(String strs){
        char[] charArray = new char[strs.length()];
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length-1; i++) {
            if(charArray[i] == charArray[i+1])
                return false;
        }
        return true;
    }



    public static void main(String[] args) {
        System.out.println("Answer:"+isUniqueCharsMap("zupreet"));
        System.out.println("Answer:"+isUniqueChars("sanket"));
        System.out.println("Answer:"+isUniqueCharsSort("sushmaa"));
    }
}
