/*
    Question: Given an array nums of size n, return the majority element.

    The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

    Input: nums = [3,2,3]
    Output: 3

    link: https://www.codingninjas.com/codestudio/problems/day-6-majority-element_8230731?challengeSlug=striver-sde-challenge&leftPanelTab=1
*/

public class MajorityElement1 {
    public static int findMajority(int[] arr, int n) {
		// Write your code here.
		int cnt = 0;
		int num = 0;
		for(int i=0; i<n; i++) {
			if(cnt == 0){
				num = arr[i];
				cnt = 1;
			} 
			else if(arr[i] == num) cnt++;
			else if(arr[i] != num) cnt--;
		}
		
		int cnt1 = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] == num) cnt1++;
		}
		if(cnt1 > n/2) return num;
		return -1;
	}
}