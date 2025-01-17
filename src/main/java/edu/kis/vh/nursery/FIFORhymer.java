package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private  DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut());

        int out = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return out;
    }
}
