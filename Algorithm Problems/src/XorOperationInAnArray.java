/*
You are given an integer n and an integer start.

Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.

Return the bitwise XOR of all elements of nums.



Example 1:

Input: n = 5, start = 0
Output: 8
Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
Where "^" corresponds to bitwise XOR operator.
Example 2:

Input: n = 4, start = 3
Output: 8
Explanation: Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8.
* */

public class XorOperationInAnArray {
    public static void main(String[] args) {

        int n1 = 5, start1 = 0;
        System.out.println(solution(n1, start1)); // Saída esperada: 8

        int n2 = 4, start2 = 3;
        System.out.println(solution(n2, start2)); // Saída esperada: 8
    }
    public static int solution(int n, int start) {
        int xorResult = 0;

        for (int i = 0; i < n; i++) {
            int num = start + 2 * i;
            xorResult ^= num;
        }

        return xorResult;
    }
}
