/*
    Question: You are given a sorted integer array' ARR' of size 'N'. You need to remove the duplicates from the array such that each element appears only once. Return the length of this new array.
    Note:
    Do not allocate extra space for another array. You need to do this by modifying the given input array in-place with O(1) extra memory. 

    N = 5
    Array = {2, 2, 2, 2, 2}
    Output: {2}
    Explanation: After removing all the duplicates 
    only one instance of 2 will remain.

    link: https://www.codingninjas.com/codestudio/problems/remove-duplicates-from-sorted-array_8230811?challengeSlug=striver-sde-challenge&leftPanelTab=0
*/

import java.util.*;

public class RemoveDuplicate {
    public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		int j = 0;
		for(int i=1; i<n; i++) {
			if(arr.get(i) > arr.get(j)) {
				arr.set(j+1,arr.get(i));
				j++; 
			}
		}
		return j+1;
	}
}
