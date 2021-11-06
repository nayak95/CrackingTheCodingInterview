package Arrays_Strings.Ques3;

public class Solution {
    public static void replaceSpaces(char[] str, int trueLength){
        int spaceCount = 0, index, i = 0;
        for (i = 0; i < trueLength; i++)
            if (str[i] == ' ')
                spaceCount++;
        index = trueLength + spaceCount*2;
        for (i = trueLength - 1; i >= 0; i--)
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index -= 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
    }

    public static void main(String[] args) {
        String input = "Sanket Nayak  ";
        char[] inputArray = input.toCharArray();
        replaceSpaces(inputArray, 12);
        System.out.println(new String(inputArray));

    }
}
