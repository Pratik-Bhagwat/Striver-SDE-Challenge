/*
    Question: You are given an array of ‘N’ integers. You have to find the sum of all the subsets in the non-decreasing order of the given array.
    For Example
    If N=3 and array elements are [1,2].
    Following are the subset sums:
    0 (by considering empty subset)
    1 
    2
    1+2 = 3
    So, subset sum are [0,1,2,3].

    Sample Input 1 :
    2
    2
    1 2
    1
    0
    Sample Output 1 :
    0 1 2 3
    0 0

    link: https://www.codingninjas.com/codestudio/problems/subset-sum_8230859?challengeSlug=striver-sde-challenge&leftPanelTab=0
*/

import java.util.*;

public class SubsetSum {
    private static void getAllSubsetSum(int idx,ArrayList<Integer> res, int[] nums,int sum) {
        if(idx >= nums.length) {
            res.add(sum);
            return;
        }

        getAllSubsetSum(idx+1, res, nums, sum+nums[idx]);
        getAllSubsetSum(idx+1, res, nums, sum);
    }
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> res = new ArrayList<>();
        getAllSubsetSum(0,res,num,0);
        Collections.sort(res);
        return res;
    }
}
