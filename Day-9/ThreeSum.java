/*
    Question: You are given an array/list ARR consisting of N integers. Your task is to find all the distinct triplets present in the array which adds up to a given number K.
    An array is said to have a triplet {ARR[i], ARR[j], ARR[k]} with sum = 'K' if there exists three indices i, j and k such that i!=j, j!=k and i!=j and ARR[i] + ARR[j] + ARR[k] = 'K'.

    Sample Input 1:
    1
    5
    10 5 5 5 2
    12
    Sample Output 1:
    5 5 2

    link: https://leetcode.com/problems/3sum/description/
*/

import java.util.*;

public class ThreeSum {

    public static ArrayList<ArrayList<Integer>> findTriplets(int[] num, int n, int k) {

		Arrays.sort(num);
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			if (i > 0 && num[i] == num[i - 1])
				continue;

			int start = i + 1, end = num.length - 1;

			while (start < end) {
				int sum = num[i] + num[start] + num[end];

				if (sum == k) {
					ArrayList<Integer> list = new ArrayList<>();
					list.add(num[i]);
					list.add(num[start]);
					list.add(num[end]);

					res.add(list);

					start++;
					end--;

					while (start < end && num[start] == num[start - 1])
						start++;
					while (start < end && num[end] == num[end + 1])
						end--;
				} else if (sum < k) {
					start++;
				} else {
					end--;
				}
			}
		}

		return res;
	}
}
