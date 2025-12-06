package bitmanipulation;
/*
Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.

NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class SingleNumber {
    public int singleNumber(final int[] A) {
        int res = 0;
        for(int i = 0; i < A.length; i++) {
            res = res ^ A[i];
        }
        return res;
    }
}
