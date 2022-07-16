package carry_forward;
/*
You have given a string A having Uppercase English letters.

You have to find how many times subsequence "AG" is there in the given string.

NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
 */
public class SpecialSubsequenceAG {
    public int solve(String A) {
        int n = A.length();
        // int gCount = 0, res = 0;
        // char g = 'G', a = 'A';
        // for(int i = 0; i < n; i++) {
        //     if(A.charAt(i) == g) gCount++;
        // }
        // for(int i = 0; i < n; i++) {
        //     if(A.charAt(i) == a) {
        //         res += gCount;
        //     }
        //     if(A.charAt(i) == g) {
        //         gCount--;
        //     }
        // }


        // int[] ps = new int[n];
        // ps[0] = 0;
        // char g = 'G', a = 'A';
        // for(int i = 1; i < n; i++) {
        //     if(A.charAt(i) == g) ps[i] = ps[i-1]+1;
        //     else ps[i] = ps[i-1];
        // }
        // int res = 0;
        // for(int i = 0; i < n; i++) {
        //     if(A.charAt(i) == a) {
        //         res += ps[n-1] - ps[i];
        //     }
        // }

        // int aCount = 0, res = 0;
        // char g = 'G', a = 'A';
        // for(int i = 0; i < n; i++) {
        //     if(A.charAt(i) == a) {
        //         aCount++;
        //     }
        //     else if(A.charAt(i) == g) {
        //         res += aCount;
        //     }
        // }
        // int modulo = (int) Math.pow(10, 9) + 7;
        // return res % modulo;
        int a_count = 0;
        int current = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'A')
                a_count++;
            else if (A.charAt(i) == 'G')
                current += a_count;
        }
        int modulo = (int) Math.pow(10, 9) + 7;
        return (current % modulo);
    }
}
