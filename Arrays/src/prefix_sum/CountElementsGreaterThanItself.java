package prefix_sum;

/*
Given an Array find an element which has atleast one element greater than itself.
 */
public class CountElementsGreaterThanItself {
    public static int countGreater(int[] ar) {
        int n = ar.length;
        int mx = ar[0];

        int count;
        for(count = 0; count < n; ++count) {
            if (mx < ar[count]) {
                mx = ar[count];
            }
        }

        count = 0;

        for(int i = 0; i < n; ++i) {
            if (mx == ar[i]) {
                ++count;
            }
        }

        return n - count;
    }

    public static void main(String[] args) {
        int[] ar = new int[]{2, 3, 10, 7, 3, 2, 10, 8};
        System.out.println(countGreater(ar));
    }
}
