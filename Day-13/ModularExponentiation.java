/*
    Question: Problem Statement
    Suggest Edit
    You are given a three integers 'X', 'N', and 'M'. Your task is to find ('X' ^ 'N') % 'M'. A ^ B is defined as A raised to power B and A % C is the remainder when A is divided by C.

    Sample Input 1 :
    2 
    3 1 2
    4 3 10
    Sample Output 1 :
    1
    4

    link: https://www.codingninjas.com/codestudio/problems/modular-exponentiation_8230803?challengeSlug=striver-sde-challenge&leftPanelTab=0
*/

public class ModularExponentiation {
     public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.
        if (m == 0) {
            return -1; // Invalid case, modulus cannot be zero
        }

        if (n == 0) {
            return 1; // Any number raised to the power of 0 is 1
        }
        long result = 1;
        long base = x % m;

        while (n > 0) {
            if (n % 2 == 1) {
                result = (result * base) % m;
            }

            base = (base * base) % m;
            n /= 2;
        }

        return (int) result;
    }
}
