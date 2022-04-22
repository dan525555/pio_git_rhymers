package edu.kis.vh.nursery.list;

public class IntLinkedList {
    private static final int ERROR_CODE = -1;
    private Node last;
    private int val;

    public void push(int val) {
        if (last == null)
            last = new Node(val);
        else {
            last.setNext(new Node(val));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return ERROR_CODE;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return ERROR_CODE;
        int val = last.getValue();
        last = last.getPrev();
        return val;
    }

}
