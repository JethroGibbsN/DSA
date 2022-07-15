/*
You are given a string S, and you have to find all the amazing substrings of S.

An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
 */

public class AmazingSubArrays {
    public int solve(String A) {
        int n = A.length(), res = 0;
        A = A.toLowerCase();
        char[] ar = A.toCharArray();
        String aeiou = "aeiou";
        for(int i = 0; i < n; i++) {
            if(aeiou.contains(String.valueOf(ar[i]))) {
                res += (n-i);
            }
            res = res%10003;
        }
        return res;
    }
}
