package bitmanipulation;
/*
Write a function that takes an integer and returns the number of 1 bits it has.
 */
public class NoOf1Bits {
    public int numSetBits(int A) {
        if(A == 0) return 0;
        int res = 1;
        while(A > 1) {
            if(A%2 == 1) res++;
            A /= 2;
        }
        return res;
    }
}
