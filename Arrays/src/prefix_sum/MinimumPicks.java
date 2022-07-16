package prefix_sum;/*
You are given an array of integers A of size N.
Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.
 */

public class MinimumPicks {
    public static int solve(int[] A) {
        int n = A.length;
        int evenMax = Integer.MIN_VALUE, oddMin = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(A[i] % 2 == 0 && A[i] > evenMax) {
                evenMax = A[i];
            }
            if(A[i] % 2 != 0 && A[i] < oddMin) {
                oddMin = A[i];
            }
        }
        return evenMax - oddMin;
    }

    public static void main(String[] args) {
        int[] ar = {5, 17, 100, 1};
        System.out.println(solve(ar));
    }

}
