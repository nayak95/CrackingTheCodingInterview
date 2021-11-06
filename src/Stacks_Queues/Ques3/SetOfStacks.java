package Stacks_Queues.Ques3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SetOfStacks {
    List<Stack> stacks = new ArrayList<>();
    public int capacity;

    public SetOfStacks(int capacity) {
        this.capacity = capacity;
    }
    public Stack getLastStack(){
        if (stacks.size() == 0) return null;
        return stacks.get(stacks.size() - 1);
    }
    
    public void push(int v){
        Stack last = getLastStack();
//        if (last != null && !last.isFull())
    }
}
