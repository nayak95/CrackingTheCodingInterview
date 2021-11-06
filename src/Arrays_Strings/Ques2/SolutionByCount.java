package Arrays_Strings.Ques2;

public class SolutionByCount {
    public static boolean checkByPermutation(String s, String t) {
        if (s.length() != t.length())
            return false;
        else{
            int[] freq = new int[128];
            char[] charArray = s.toCharArray();
            for (char c : charArray)
                freq[c]++;

            for (int i = 0; i < t.length(); i++) {
                int index = t.charAt(i);
                freq[index]--;
                if (freq[index] < 0)
                    return false;
            }
        }

        return true;
    }
}
