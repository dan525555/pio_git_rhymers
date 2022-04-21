package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int tot_rej = 0;//tutaj

    public int reportRejected() {
        return tot_rej;
    }

    @Override
    public void countIn(int numb) {
        if (!callCheck() && numb > peekaboo())//tutaj
            tot_rej++;
        else//tutaj
            super.countIn(numb);//tutaj
    }
}
