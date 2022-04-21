package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int NUMBERS_ARRAY_INIT_VALUE = 12;
    private static final int TOTAL_INIT_VALUE = -1;

    private final int[] numbers = new int[NUMBERS_ARRAY_INIT_VALUE];

    public int total = TOTAL_INIT_VALUE;

    public void countIn(int numb) {
        if (!isFull())
           numbers[++total] = numb;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
