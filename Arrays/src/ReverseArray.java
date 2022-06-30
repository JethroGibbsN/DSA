import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse(final int[] A) {
        int n = A.length;
        int[] res = new int[n];
        for(int i = n-1; i >= 0; i--) {
            res[n-i-1] = A[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverse(arr)));
    }
}
