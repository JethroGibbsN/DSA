package carry_forward;

import java.util.Arrays;

/*
Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.
 */
public class ClosestMinMax {
    public int solve(int[] A) {
        int n = A.length;
        int min = Arrays.stream(A).min().getAsInt();
        int max = Arrays.stream(A).max().getAsInt();
        int min_ind = -1, max_ind = -1, ans = n;
        for(int i = n-1; i >= 0; i--) {
            if(A[i] == min) {
                min_ind = i;
            }
            if(A[i] == max) {
                if(min_ind != -1) {
                    ans = Math.min(ans, min_ind-i+1);
                }
            }
        }
        for(int i = n-1; i >= 0; i--) {
            if(A[i] == max) {
                max_ind = i;
            }
            if(A[i] == min) {
                if(max_ind != -1) {
                    ans = Math.min(ans, max_ind-i+1);
                }
            }
        }
        return ans;
    }
}
