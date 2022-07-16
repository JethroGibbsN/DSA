package prefix_sum;/*
Given an array A and an integer B.
A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B).
Check if any good pair exist or not.
 */

public class GoodPair {
    public static int solve(int[] A, int B) {
        int n = A.length;
//        int max = 0, min = Integer.MAX_VALUE;
        for(int i = 0; i< n; i++) {
            for(int j = i+1; j < n; j++) {
                if(i != j && (A[i] + A[j] == B)) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int ar[] = {1,2,3,4};
        System.out.println(solve(ar, 7));
    }
}
