/*
Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.

Note: It is always possible to form the product array with integer (32 bit) values.
 */
public class ProductArrayPuzzle {
    public int[] solve(int[] A) {
        int n = A.length;
        int[] B = A.clone();
        for(int i = 1; i < n; i++) {
            A[i] = A[i] * A[i-1];
        }
        int prodVal = A[n-1];
        for(int i = 0; i < n; i++) {
            A[i] = prodVal / B[i];
        }
        return A;
    }
}
