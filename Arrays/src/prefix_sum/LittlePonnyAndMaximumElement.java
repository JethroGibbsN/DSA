package prefix_sum;/*
Little Ponny is given an array, A, of N integers. In a particular operation, he can set any element of the array equal to -1.

He wants your help in finding out the minimum number of operations required such that the maximum element of the resulting array is B. If it is not possible, then return -1.
 */

public class LittlePonnyAndMaximumElement {
    static boolean search(int arr[], int n, int x)
    {
        if (arr[n - 1] == x)
            return true;

        int backup = arr[n - 1];
        arr[n - 1] = x;
        for (int i = 0;; i++) {
            if (arr[i] == x) {
                arr[n - 1] = backup;
                if (i < n - 1)
                    return true;
                return false;
            }
        }
    }
    static int solve(int[] A, int B) {
        int n = A.length;
        boolean BExists = search(A, n, B);
        if(!BExists) {
            return -1;
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(A[i] > B) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] ar = {2, 4, 3, 1, 5};
        int b = 3;
        System.out.println(solve(ar, b));
    }
}
