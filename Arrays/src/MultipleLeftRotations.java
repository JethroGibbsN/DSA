/*
Given an array of integers A and multiple values in B, which represents the number of times array A needs to be left rotated.

Find the rotated array for each value and return the result in the from of a matrix where ith row represents the rotated array for the ith value in B.
 */

public class MultipleLeftRotations {
    public int[][] solve(int[] A, int[] B) {
        int b1 = B.length;
        int a = A.length;
        int[][] res = new int[b1][a];
        for (int b = 0; b < b1; b++) {
            int d = B[b], n = a, p = 1;
            int[] ab = A.clone();
            while (p <= d) {
                int last = ab[0];
                for (int i = 0; i < n - 1; i++) {
                    ab[i] = ab[i + 1];
                }
                ab[n - 1] = last;
                p++;
            }
            res[b] = ab.clone();
        }
        return res;
    }
}
