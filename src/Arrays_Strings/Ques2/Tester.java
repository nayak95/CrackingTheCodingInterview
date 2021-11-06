package Arrays_Strings.Ques2;

public class Tester {
    public static void main(String[] args) {
        Solution method1 = new Solution();
        System.out.println(method1.checkPermutationBySort("sanket", "teknas"));
        SolutionByCount method2 = new SolutionByCount();
        System.out.println(method2.checkByPermutation("supreet", "upreets"));
    }
}
