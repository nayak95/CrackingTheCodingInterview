package Stacks_Queues.Ques4;

import java.util.Stack;

public class MyQueue<Integer> {
    Stack<Integer> stackNewest, stackOldest;

    public MyQueue() {
        stackNewest = new Stack<Integer>();
        stackOldest = new Stack<Integer>();
    }

    public int size(){
        return stackNewest.size() + stackOldest.size();
    }

    public void add(Integer value){
        stackNewest.push(value);
    }
    private void shiftStacks() {
        if (stackOldest.isEmpty()){
            while (!stackNewest.isEmpty()){
                stackOldest.push(stackNewest.pop());
            }
        }
    }
    public Integer remove() {
        shiftStacks();
        return stackOldest.pop();
    }
    public Integer peek(){
        shiftStacks();
        return stackOldest.peek();
    }
}
