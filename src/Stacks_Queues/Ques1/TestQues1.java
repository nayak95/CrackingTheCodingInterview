package Stacks_Queues.Ques1;

public class TestQues1 {

    public static void main(String[] args) throws Exception {
        FixedMultiStack fixedStack = new FixedMultiStack(3);
        fixedStack.isEmpty(0);
        fixedStack.isEmpty(1);
        fixedStack.isEmpty(2);
        for (int i = 0; i < 9; i++) {
            fixedStack.push(i/3, i);
        }
//        fixedStack.push(0, 1000);
        System.out.println(fixedStack.toString());
        int i = 2;
        while(i > -1)
            System.out.println(fixedStack.pop(i--)+" ");
        System.out.println(fixedStack.toString());
    }


}
