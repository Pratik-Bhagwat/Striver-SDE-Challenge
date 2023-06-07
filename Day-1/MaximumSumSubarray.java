/*
    Question: Given an integer array nums, find the subarray with the largest sum, and return its sum.

    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: The subarray [4,-1,2,1] has the largest sum 6.
*/

public class MaximumSumSubarray {
    public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long sum = 0 , maxSum = 0;

		for(int i=0; i<n; i++) {
			sum += arr[i];
			maxSum = Math.max(sum, maxSum);

			if(sum < 0 ) sum = 0;
		}		
		return maxSum;
	}
}
