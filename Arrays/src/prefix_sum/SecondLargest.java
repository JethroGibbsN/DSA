package prefix_sum;

/*
You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.
 */
public class SecondLargest {
    public int solve(int[] A) {
        int n = A.length;
        if(n < 2) {
            return -1;
        }
        int large = 0;
        int large2 = 0;
        for(int i = 0; i < n; i++) {
            if(A[i] >= large) {
                large2 = large;
                large = A[i];

            }
            else if (A[i] > large2 && A[i] != large)
                large2 = A[i];
        }
        return large2;
    }
}
