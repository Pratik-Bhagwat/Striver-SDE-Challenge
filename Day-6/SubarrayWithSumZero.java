/*
    Question: Problem Statement
    Ninja loves playing with numbers. So his friend gives him an array on his birthday.

    The array consists of positive and negative integers. 
    
    Now Ninja is interested in finding the length of the longest subarray whose sum is zero.

    Sample Input 1:
    2 
    5
    1 3 -1 4 -4
    4
    1 -1 2 -2 
    Sample Output 1:
    2
    4 

    link : https://www.codingninjas.com/codestudio/problems/longest-subarray-zero-sum_8230747?challengeSlug=striver-sde-challenge&leftPanelTab=0
*/

import java.util.* ;

public class SubarrayWithSumZero {
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		HashMap<Integer,Integer> map = new HashMap<>();
		
		int sum = 0;
		int n = arr.size(), length = 0;

		for(int i=0; i<n; i++) {
			sum += arr.get(i);
			if(sum == 0) length = i + 1;
			
			if(map.containsKey(sum)) {
				length = Math.max(length,i - map.get(sum));
			}
			if(!map.containsKey(sum)) map.put(sum,i);
		}
		return length;
	}
}