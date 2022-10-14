package array_math;

public class NthMagicNumber {
    public int nthMagicNumber(int n) {
        int p = 1, res = 0;
        while(n != 0) {
            if((n & 1) == 1) {
                res += p*5;
            }
            n = n >> 1; // or n = n/2
        }
        return res;
    }
}
