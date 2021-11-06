package Stacks_Queues.Ques1;

import java.util.EmptyStackException;

public class FixedMultiStack1 {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public FixedMultiStack1(int stackSize) {
        this.numberOfStacks = numberOfStacks;
        this.stackCapacity = stackSize;
        this.values = new int[numberOfStacks*stackCapacity];
        this.sizes = new int[numberOfStacks];
    }

    public void push(int stackNum, int value) throws Exception {
        if(isFull(stackNum))
            throw new Exception();
        sizes[stackNum]++;
        values[indexOfTop(stackNum)] = value;
    }

    public int pop(int stackNum){
        if(isEmpty(stackNum))
            throw new EmptyStackException();
        int value = values[indexOfTop(stackNum)];
        values[indexOfTop(stackNum)] = 0;
        sizes[stackNum]--;
        return value;
    }

    public int peek(int stackNum){
        if(isEmpty(stackNum))
            throw new EmptyStackException();
        return values[indexOfTop(stackNum)];
    }

    public boolean isEmpty(int stackNum){
        return sizes[stackNum] == stackCapacity;
    }
    public boolean isFull(int stackNum){
        return sizes[stackNum] == 0;
    }
    private int indexOfTop(int stackNum) {
//        int offset = stackNum*stackCapacity;
//        int size = sizes[stackNum];
        return stackNum*stackCapacity + sizes[stackNum] - 1;
    }
}
