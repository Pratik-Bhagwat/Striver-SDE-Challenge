/*
    Question : Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

    Input: nums = [3,2,3]
    Output: [3]

    link: https://leetcode.com/problems/majority-element-ii/description/
*/

import java.util.*;

public class MajorityElement2 {
    //We are solving this using Moore's Voting Algorithm but slightly modified.
     public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0 , cnt2 = 0;
        int ele1 = 0, ele2 = 0;
        int n = nums.length;

        for(int i=0; i<nums.length; i++) {
            if(cnt1 == 0 && nums[i] != ele2) {
                cnt1 = 1;
                ele1 = nums[i];
            }
            else if(cnt2 == 0 && nums[i] != ele1) {
                cnt2 = 1;
                ele2 = nums[i];
            }
            else if(nums[i] == ele1) cnt1++;
            else if(nums[i] == ele2) cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> res = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        for(int i=0; i<nums.length; i++) {
            if(ele1 == nums[i]) cnt1++;
            else if(ele2 == nums[i]) cnt2++;
        }
        int mini = n/3;
        if(cnt1 > mini) res.add(ele1);
        if(cnt2 > mini) res.add(ele2);
        return res;
    }   
}
