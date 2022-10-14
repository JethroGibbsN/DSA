package matrices;

/*
Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.
For A = 5, print [ [1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], [13, 12, 11, 10, 9] ]
 */

public class SpiralOrderMatrixII {
    private int count = 0;
    public int[][] helper(int[][] A, int s, int e, int count) {
        int n = A.length;
        for(int i = s; i <= e; i++) {
            A[s][i] = ++count;
        }
        for(int i = s+1; i <= e; i++) {
            A[i][e] = ++count;
        }
        for(int i = e-1; i >= s; i--) {
            A[e][i] = ++count;
        }
        for(int i = e-1; i > s; i--) {
            A[i][s] = ++count;
        }
        this.count = count;
        return A;
    }
    public int[][] generateMatrix(int A) {
        int[][] res = new int[A][A];
        if(A % 2 != 0) res[A/2][A/2] = A*A;
        int start = 0, end = A - 1;
        for(int i = 0; i < A/2; i++) {
            res = helper(res, start, end, this.count);
            start++;
            end--;
        }
        return res;
    }
}
