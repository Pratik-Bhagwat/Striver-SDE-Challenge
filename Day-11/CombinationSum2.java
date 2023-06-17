/*
    Question: Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

    Each number in candidates may only be used once in the combination.

    Note: The solution set must not contain duplicate combinations.

    

    Example 1:

    Input: candidates = [10,1,2,7,6,1,5], target = 8
    Output: 
    [
    [1,1,6],
    [1,2,5],
    [1,7],
    [2,6]
    ]

    link: https://leetcode.com/problems/combination-sum-ii/
*/

import java.util.*;

public class CombinationSum2 {
    private void combiSum2(int[] arr,int idx,int target,ArrayList<Integer> temp,List<List<Integer>>res) {

            if(target == 0) {
                res.add(new ArrayList<>(temp));
                return;
            }

        for(int i=idx; i<arr.length; i++) {
            // checking the previous element is same or not if same the dont pic it.
            if(i > idx && arr[i] == arr[i - 1]) continue;

            // checking if at some point our arr[i] > target then no point of any further recur calls.
            if(arr[i] > target) break;
    
            temp.add(arr[i]);
            combiSum2(arr,i + 1, target-arr[i],temp,res);
            temp.remove(temp.size()-1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);

        combiSum2(candidates,0,target,new ArrayList<>(),res);
        return res;
    }
}
