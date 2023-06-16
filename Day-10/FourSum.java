/*
    Question: Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

    0 <= a, b, c, d < n
    a, b, c, and d are distinct.
    nums[a] + nums[b] + nums[c] + nums[d] == target
    You may return the answer in any order.

    

    Example 1:

    Input: nums = [1,0,-1,0,-2,2], target = 0
    Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

    link: https://leetcode.com/problems/4sum/
*/
import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {

        if (i > 0 && arr[i] == arr[i - 1])
            continue;

        for (int j = i + 1; j < n; j++) {

            if (j > i + 1 && arr[j] == arr[j - 1])
            continue;

            int k = j + 1;
            int l = n - 1;

            while (k < l) {
            long sum = 0;
            sum += arr[i];
            sum += arr[j];
            sum += arr[k];
            sum += arr[l];
            if (sum == target) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[j]);
                list.add(arr[k]);
                list.add(arr[l]);

                ans.add(list);
                k++;
                l--;

                while (k < l && arr[k] == arr[k - 1])
                k++;
                while (k < l && arr[l] == arr[l + 1])
                l--;
            } else if (sum < target)
                k++;
            else
                l--;
            }
        }
        }
        return ans;
  }
}
