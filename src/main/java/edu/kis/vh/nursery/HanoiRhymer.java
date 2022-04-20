package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalRejected = 0;//tutaj

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())//tutaj
            totalRejected++;
        else//tutaj
            super.countIn(in);//tutaj
    }
}
