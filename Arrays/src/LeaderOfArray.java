/*
Given an integer array A containing N distinct integers, you have to find all the leaders in array A.

An element is a leader if it is strictly greater than all the elements to its right side.

NOTE:The rightmost element is always a leader. */

import java.util.ArrayList;

public class LeaderOfArray {

    //1st Implementation
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        int max = A.get(n-1);
        ArrayList<Integer> res = new ArrayList<>();
        res.add(A.get(n-1));
        for(int i = n-2; i >= 0; i--) {
            if(A.get(i) > max) {
                max = A.get(i);
                res.add(A.get(i));
            }
        }
        return res;
    }

    //2nd Implementation
    public static void main(String[] args) {
        int[] arr = {-9, -3, -7, -8, -4};
        int n = arr.length;
        int max = arr[n-1], count = 1;
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] > max) {
                max = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
