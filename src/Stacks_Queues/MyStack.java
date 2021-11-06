package Stacks_Queues;

import java.util.EmptyStackException;

public class MyStack <Integer>{
    private static  class StackNode<Integer> {
        private Integer data;
        private StackNode<Integer> next;

        public StackNode(Integer data){
            this.data = data;
        }
    }
    private StackNode<Integer> top;

    public Integer pop() {
        if (top == null) throw new EmptyStackException();
        Integer item = top.data;
        top = top.next;
        return item;
    }

    public Integer peek(){
        if (top == null) throw new EmptyStackException();
        return top.data;
    }
    public boolean isEmpty(){
        return top == null;
    }
}
