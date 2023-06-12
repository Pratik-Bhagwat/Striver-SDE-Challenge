/*
    Question: Given a string s, find the length of the longest substring without repeating characters.

    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.

    link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
*/

public class LongestUniqueSubstring {
    public static int uniqueSubstrings(String input) {
		int repeat = 0;
		int length = 0;
		int start = 0, end = 0, n = input.length();

		int[] freq = new int[256];

		while (end < n) {
			freq[input.charAt(end)]++;
			if (freq[input.charAt(end)] > 1)
				repeat++;
			end++;

			while (start < end && repeat > 0) {
				if (freq[input.charAt(start)] > 1) {
					repeat--;
				}
				freq[input.charAt(start)]--;
				start++;
			}
			if (repeat == 0)
				length = Math.max(length, end - start);
		}
		return length;
	}
}
