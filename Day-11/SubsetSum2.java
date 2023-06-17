/*
    Question: Given an integer array nums that may contain duplicates, return all possible 
    subsets
    (the power set).

    The solution set must not contain duplicate subsets. Return the solution in any order.

    

    Example 1:

    Input: nums = [1,2,2]
    Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

    link: https://leetcode.com/problems/subsets-ii/
*/

import java.util.*;

public class SubsetSum2 {
     private void getAllSubsets(int idx,int[] arr,List<List<Integer>> ans,ArrayList<Integer>list) {
        ans.add(new ArrayList<>(list));
        for(int i=idx; i<arr.length; i++) {
            if(i > idx && arr[i] == arr[i-1]) continue;
            list.add(arr[i]);
            getAllSubsets(i+1,arr,ans,list);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        getAllSubsets(0,nums,ans,new ArrayList<>());
        return ans;
    }
}
