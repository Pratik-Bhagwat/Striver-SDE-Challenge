/*
    Question: Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
    
    Example 1:

    Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
    Output: 6
    Explanation: [1,1,1,0,0,1,1,1,1,1,1]
    Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

    link: https://leetcode.com/problems/max-consecutive-ones-iii/description/
*/

public class MaxConsecutiveOne3 {
    public int longestOnes(int[] nums, int k) {
        int start = 0, end = 0, flip = 0, ans = Integer.MIN_VALUE;

        while(end < nums.length) {

            //1. expansion
            if(nums[end] == 0) flip++;
            end++;

            //2. contraction.
            while(start < end && flip > k) {
                    if(nums[start] == 0) flip--;
                    start++;
                } 

            //3. calculation
            ans = Math.max(ans,(end - start));
        }
        return ans;
    }
}
