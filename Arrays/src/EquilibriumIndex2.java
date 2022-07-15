/*
You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

NOTE:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.
 */
public class EquilibriumIndex2 {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int total = 0;
        for(int i = 0; i < n; i++) {
            total += nums[i];
        }
        int sl = 0, sr = total-nums[0];
        if(sl == sr) return 0;
        for(int i = 1; i < n; i++) {
            sl = sl + nums[i-1];
            sr = sr - nums[i];
            if(sl == sr) return i;
        }
        return -1;
    }
}
