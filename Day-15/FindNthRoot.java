/*
    Question: You are given two positive integers 'n' and 'm'.
    You have to return the 'nth' root of 'm', i.e. 'm(1/n)'.
    If the 'nth root is not an integer, return -1.

    Sample Input 1:
    3 27

    Sample Output 1:
    3

    link: https://www.codingninjas.com/studio/problems/find-nth-root-of-m_8230799?challengeSlug=striver-sde-challenge&leftPanelTab=0
*/

public class FindNthRoot {
    private static int func(int mid, int n, int m) {
        int ans = 1;

        for(int i=1; i<=n; i++) {
            ans *= mid;
            //this means we are getting ans greater than m. 
            if(ans > m) return 2;
        }
        // this means we found out sqrt.
        if(ans == m) return 1;

        // this means we got ans less than m
        return 0; 
    }
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int start = 1, end = m;

        while(start <= end) {
            int mid = start + (end-start)/2;

            if(func(mid,n,m) == 1) return mid;
            else if(func(mid,n,m) == 2) end = mid-1;
            else start++; 
        }
        return -1;
    }
}
