package carry_forward;

/*
A wire connects N light bulbs.

Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.

Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.

You can press the same switch multiple times.

Note: 0 represents the bulb is off and 1 represents the bulb is on.
 */
public class Bulbs {
    public int bulbs(int[] A) {
        int n = A.length, count = 0;
        boolean trueCase = true;
        for(int i = 0; i < n; i++) {
            if(A[i] == 0 && trueCase) {
                trueCase = false;
                count++;
            }
            if(A[i] == 1 && !trueCase) {
                trueCase = true;
                count++;
            }
        }
        return count;
    }
}
