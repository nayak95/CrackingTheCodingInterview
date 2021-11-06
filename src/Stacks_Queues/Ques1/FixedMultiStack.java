package Stacks_Queues.Ques1;

import java.util.Arrays;
import java.util.EmptyStackException;

public class FixedMultiStack  {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public FixedMultiStack(int stackSize){
        stackCapacity = stackSize;
        values = new int[stackSize*numberOfStacks];
        sizes = new int[numberOfStacks];
    }
    // Element into the stack
    public void push(int stackNum, int value) throws Exception {
        if(isFull(stackNum)){
            throw new Exception();
        }
        sizes[stackNum]++;
        values[indexOfTop(stackNum)] = value;
    }
    // Pop the Element
    public int pop(int stackNum){
        if(isEmpty(stackNum))
            throw new EmptyStackException();

        int topIndex = indexOfTop(stackNum);
        int value = values[topIndex];
        values[topIndex] = 0;
        sizes[stackNum]--;
        return value;
    }
    // Peek the top-most element of stack
    public int peek(int stackNum){
        if (isEmpty(stackNum))
            throw new EmptyStackException();
        return values[indexOfTop(stackNum)];
    }
    // Check whether Stack is Full or not
    public boolean isFull(int stackNum){
        return sizes[stackNum] == stackCapacity;
    }
    // Check whether the stack is Empty
    public boolean isEmpty(int stackNum){
        return sizes[stackNum] == 0;
    }
    // Get the top index of stack
    private int indexOfTop(int stackNum){
        int offset = stackNum*stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;
    }

    @Override
    public String toString() {
        return "FixedMultiStack{" +
                "numberOfStacks=" + numberOfStacks +
                ", stackCapacity=" + stackCapacity +
                ", values=" + Arrays.toString(values) +
                ", sizes=" + Arrays.toString(sizes) +
                '}';
    }
}
