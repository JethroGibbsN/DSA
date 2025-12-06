package array_math;

public class MajorityElement {
    public int majElement(final int[] A) {
        int freq = 0, e = Integer.MIN_VALUE, n = A.length, count = 0;
        for(int i = 0; i < n; i++) {
            if(freq == 0) {
                e = A[i];
                freq = 1;
            } else if (A[i] == e) {
                freq += 1;
            } else {
                freq -= 1;
            }
        }
        for(int j = 0; j < n; j++) {
            if(A[j] == e) {
                count++;
            }
        }
        return (count > (n/2)) ? e : -1;
    }
}
