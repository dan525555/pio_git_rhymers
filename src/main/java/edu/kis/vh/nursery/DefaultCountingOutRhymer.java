package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int NUMBERS_ARR_INIT_SIZE = 12;
    private static final int INIT_STACK_SIZE = -1;
    private static final int ERR_CODE = -1;
    private static final int MAX_STACK_CAPACITY = 11;
    private final int[] numbers = new int[NUMBERS_ARR_INIT_SIZE];

    private int total = INIT_STACK_SIZE;

    public void countIn(int numb) {
        if (!isFull())
            numbers[++total] = numb;
    }

    public boolean callCheck() {
        return total == INIT_STACK_SIZE;
    }

    public boolean isFull() {
        return total == MAX_STACK_CAPACITY;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERR_CODE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERR_CODE;
        return numbers[total--];
    }

}
