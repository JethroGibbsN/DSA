package subarrays;

/*
You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.
 */
public class SumOfAllSubArrays {
    public long subarraySum(int[] A) {

        long total_sum = 0;
        int N = A.length;
        for(int i =0;i<A.length;i++){
            total_sum += (long)A[i] * (i+1) * (N-i);
        }

        return total_sum;
    }
}
