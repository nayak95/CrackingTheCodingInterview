package Arrays_Strings.Archive;

import java.util.HashMap;
import java.util.Scanner;

public class separateWords {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        String str = "bharat   name is bharat name "; //sc.nextLine();
//        System.out.println(str);
        HashMap<String, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        while (i < str.length() && j < str.length()) {
            if(str.charAt(j) == ' ') {
                map.put(str.substring(i,j), map.getOrDefault(str.substring(i,j),0)+1);
                i = j+1;
            }
            else
                if (j == str.length() - 1) {
                    map.put(str.substring(i,j+1), map.getOrDefault(str.substring(i,j+1),0)+1);
                    i = j+1;
                }
            j++;
        }
        System.out.println(map);

    }
}
