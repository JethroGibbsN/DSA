/*
You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

NOTE:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.
 */

public class EquilibriumIndexArray {
    public int[] prefixArray(int[] A, int n) {

        for(int i = 1; i < n; i++) {
            A[i] = A[i] + A[i-1];
        }
        return A;
    }
    public int range(int[] pref, int l, int r, int n) {
        if(l == 0) {
            return pref[r];
        }
        return pref[r] - pref[l-1];
    }
    public int solve(int[] A) {
        int n = A.length;
        int left = 0, right = 0;
        int[] pref = prefixArray(A, n);
        for(int i = 0; i < n; i++) {
            if(i != 0){
                left = pref[i-1];
            }
            right = pref[n-1] - pref[i];
            if(left == right) return i;
        }
        return -1;
    }
}
