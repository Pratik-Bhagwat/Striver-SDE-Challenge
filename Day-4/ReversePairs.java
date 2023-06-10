/*
    Question : Given an integer array nums, return the number of reverse pairs in the array.

    A reverse pair is a pair (i, j) where:

    0 <= i < j < nums.length and
    nums[i] > 2 * nums[j]

    Input: nums = [1,3,2,3,1]
    Output: 2
    Explanation: The reverse pairs are:
    (1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
    (3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1

    link: https://leetcode.com/problems/reverse-pairs/description/
*/


import java.util.*;

public class ReversePairs {

     private int merge(int[] nums, int start, int mid, int end) {

        //we are applying our main logic here.
        int j = mid + 1;
        int cnt = 0;

        for(int i=start; i<=mid; i++) {
            while(j <= end && nums[i] > (2 * (long) nums[j])) j++;
            cnt += (j - (mid + 1));
        }
        //till here.

        int left = start;
        int right = mid + 1;
        List<Integer> list = new ArrayList<>();

        while(left <= mid && right <= end) {
            if(nums[left] <= nums[right]) {
                list.add(nums[left++]);
            }
            else list.add(nums[right++]);
        }
        while(left <= mid) {
            list.add(nums[left++]);
        }
        while(right <= end) {
            list.add(nums[right++]);
        }

        for(int i=start; i<=end; i++) {
            nums[i] = list.get(i - start);
        }

        return cnt;
    }

    private int mergeSort(int[] nums, int start, int end) {
        int cnt = 0;
        if(start >= end) return cnt;

        int mid = start + (end - start)/2;

        cnt += mergeSort(nums,start,mid);
        cnt += mergeSort(nums,mid+1,end);

        cnt += merge(nums,start,mid,end);

        return cnt; 
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
}