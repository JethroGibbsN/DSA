package matrices;

/*
You are given a n x n 2D matrix A representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

Note: If you end up using an additional array, you will only receive partial score.
 */
public class Rotate90 {
    public void solve(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A[0].length; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][A[0].length - 1 - j];
                A[i][A[0].length - 1 - j] = temp;
            }
        }

    }
}
