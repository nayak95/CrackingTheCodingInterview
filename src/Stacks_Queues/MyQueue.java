package Stacks_Queues;

import java.util.NoSuchElementException;

public class MyQueue {
    private static class QueueNode <Integer> {
        private Integer data;
        private QueueNode<Integer> next;

        public QueueNode(Integer data){
            this.data = data;
        }
    }
    private QueueNode<Integer> first;
    private QueueNode<Integer> last;

    public void add(Integer item){
        QueueNode<Integer> t = new QueueNode<>(item);
        if(last != null)
            last.next = t;
        last = t;
        if(isEmpty())
            first = last;
    }
    public Integer remove(){
        if(isEmpty()) throw new NoSuchElementException();
        Integer data = first.data;
        first = first.next;
        if(isEmpty())
            last = null;
        return data;
    }
    public Integer peek(){
        if(isEmpty()) throw new NoSuchElementException();
        return first.data;
    }
    public boolean isEmpty(){
        return first == null;
    }
}
