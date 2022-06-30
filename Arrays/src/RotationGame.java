import java.util.Scanner;

/*
Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right.
 */
public class RotationGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] input = new int[n];
        for(int x = 0; x < n; x++) {
            input[x] = s.nextInt();
        }
        int k = s.nextInt();
        k = k % n;
        if(k < n) {
            int temp = 0;
            for(int i = 0; i < n/2; i++) {
                temp = input[i];
                input[i] = input[n-i-1];
                input[n-i-1] = temp;
            }

            for(int j = 0; j < (k)/2; j++) {
                temp = input[j];
                input[j] = input[k-j-1];
                input[k-j-1] = temp;
            }

            for(int l = k; l < (n+k)/2; l++) {
                temp = input[l];
                input[l] = input[n+k-l-1];
                input[n+k-l-1] = temp;
            }
            for(int z = 0; z < n; z++) {
                System.out.print(input[z] + " ");
            }
        }

    }
}
