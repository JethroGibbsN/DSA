package prefix_sum;

import java.util.Scanner;

/*

 */
public class MinAndMaxArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] input = new int[n];
        for(int x = 0; x < n; x++) {
            input[x] = s.nextInt();
        }
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(input[i] > max) {
                max = input[i];
            }
            if(input[i] < min) {
                min = input[i];
            }
        }
        System.out.print(max + " " + min);
    }
}
