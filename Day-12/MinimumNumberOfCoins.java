/*
    Question: Dora, the explorer, visits India and decides to try the famous Indian food. However, the restaurant accepts only Indian currency i.e. [1, 2, 5, 10, 20, 50, 100, 500, 1000] valued coins.
    So, Dora goes to a bank that has an infinite supply of each of the denominations to make a change for a given ‘Amount’ of money. As a cashier at the bank, your task is to provide Dora the minimum number of coins that add up to the given ‘Amount’.
    For Example
    For Amount = 70, the minimum number of coins required is 2 i.e an Rs. 50 coin and a Rs. 20 coin.

    Sample Input 1
    2
    13
    20
    Sample Output 1
    3
    1

    link: https://www.codingninjas.com/codestudio/problems/find-minimum-number-of-coins_8230766?challengeSlug=striver-sde-challenge&leftPanelTab=0
*/

public class MinimumNumberOfCoins {
    public static int findMinimumCoins(int amount)
    {
        // Write your code here.
        int[] inr = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int cnt = 0, n = inr.length;

        for(int i=n-1; i>=0; i--) {
            while(amount >= inr[i]) {
                amount -= inr[i];
                cnt++;
            }
        }
        return cnt;
    }
}
