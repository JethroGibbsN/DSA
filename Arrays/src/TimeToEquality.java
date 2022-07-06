import java.util.ArrayList;
import java.util.Collections;
/*\
Given an integer array A of size N. In one second, you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal.
 */

public class TimeToEquality {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        int maxValue = Collections.max(A);
        int res = 0;
        for(Integer a : A){
            res += maxValue - a;
        }
        return res;
    }
}
