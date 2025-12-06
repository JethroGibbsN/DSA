package subarrays;

public class MaximumSubArraySum {
    public static int maxSubarray(int A, int B, int[] C) {
        int res = 0;
        int sum = 0, temp = 0;
        int[] ps = new int[A];
        ps[0] = C[0];
        for(int r = 1; r < A; r++) {
            ps[r] = ps[r-1] + C[r];
        }
        for(int i = 0; i < A; i++) {
            for(int j = i; j < A; j++) {
                sum = i == 0 ? ps[j] : ps[j] - ps[i-1];
                if(sum <= B && sum > res) {
                    res = sum;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] C = {7,1,8,5,8,5,3,3,5};
        int A = 9;
        int B = 78;
        System.out.println(maxSubarray(A, B, C));
    }
}
