package prefix_sum;/*
You are given an integer array A of size N.

You have to pick B elements in total. Some (possibly 0) elements from left end of array A and some (possibly 0) from the right end of array A to get the maximum sum.

Find and return this maximum possible sum.

NOTE: Suppose B = 4, and array A contains 10 elements, then

You can pick the first four elements or can pick the last four elements, or can pick 1 from front and 3 from the back, etc. You need to return the maximum possible sum of elements you can pick.
 */

public class PickFromBothSides {
    public static int solve(int[] A, int B) {
        int sum = 0, back = B-1, end = 1;
        int n = A.length;
        for(int i = 0; i < B; i++) {
            sum += A[i];
        }
        int res = sum;

        while(back >= 0) {
            sum = sum - A[back] + A[n-end];
            res = Math.max(sum, res);
            back--;
            end++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ar = {5, -2, 3, 1, 2};
        System.out.println(solve(ar, 3));
    }
}
