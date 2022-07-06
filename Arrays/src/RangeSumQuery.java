/*
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

Input Format
The first argument is the integer array A.
The second argument is the 2D integer array B.

Output Format
Return an integer array of length M where ith element is the answer for ith query in B.

Example Input
A = [1, 2, 3, 4, 5]
B = [[1, 4], [2, 3]]

Example Output
[10, 5]
 */

public class RangeSumQuery {
    public long[] rangeSum(int[] A, int[][] B) {
        int bLength = B.length;
        int aLength = A.length;
        long[] res = new long[bLength];
        long[] prefSum = new long[aLength];
        prefSum[0] = A[0];
        for (int i = 1; i<aLength; i++) {
            prefSum[i] = prefSum[i - 1] + A[i];
        }
        for(int t = 0; t < bLength; t++) {
            if(B[t][0]-1 > 0) {

                res[t] = prefSum[B[t][1]-1] - prefSum[B[t][0]-2];
            } else {
                res[t] = prefSum[B[t][1]-1];
            }
        }
        return res;
    }
}
