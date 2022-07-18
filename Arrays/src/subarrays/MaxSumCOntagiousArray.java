package subarrays;

/*
Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.
 */
public class MaxSumCOntagiousArray {
    public int maxSubArray(final int[] A) {
        int n = A.length;
        int sum = A[0];
        int res = sum;
        for(int i = 1; i < n; i++) {
            sum = Math.max(A[i], sum + A[i]);
            res = Math.max(res, sum);
        }
        return res;
    }
}
