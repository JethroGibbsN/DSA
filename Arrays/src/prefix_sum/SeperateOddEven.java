package prefix_sum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
You are given an integer T denoting the number of test cases. For each test case, you are given an integer array A.

You have to put the odd and even elements of array A in 2 separate arrays and print the new arrays.

NOTE: Array elements should have the same relative order as in A.
 */
public class SeperateOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            List<Integer> oddList = new ArrayList<>();
            List<Integer> evenList = new ArrayList<>();
            for(int i=0; i<n; i++){
                int v = sc.nextInt();
                if(v % 2 == 0){
                    evenList.add(v);
                }else{
                    oddList.add(v);
                }
            }
            for(int val : oddList){
                System.out.print(val+" ");
            }
            System.out.println();
            for(int val : evenList){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
