package edu.kis.vh.nursery.list;

public class IntLinkedList {
    private static final int ERROR_CODE = -1;
    private Node last;
    private int val;

    public void push(int val) {
        if (last == null)
            last = new Node(val);
        else {
            last.next = new Node(val);
            last.next.prev = last;
            last = last.next;
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
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return ERROR_CODE;
        int val = last.value;
        last = last.prev;
        return val;
    }

}
