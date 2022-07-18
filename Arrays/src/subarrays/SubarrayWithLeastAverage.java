package subarrays;

/*
Given an array of size N, find the subarray of size K with the least average.
 */
public class SubarrayWithLeastAverage {
    public int solve(int[] A, int B) {
        int n = A.length;
        int[] ps = new int[n];
        ps[0] = A[0];
        for(int r = 1; r < n; r++) {
            ps[r] = ps[r-1] + A[r];
        }
        int res = 0, sum = 0;

        sum = ps[B-1];
        for(int j = B; j < n; j++) {
            if((ps[j] - ps[j-B]) < sum) {
                sum = (ps[j] - ps[j-B]);
                res = j-B+1;
            }
        }
        return res;
    }
}
