/*Given an integer number n, return the difference between the product of its digits and the sum of its digits.


Example 1:

Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15
Example 2:

Input: n = 4421
Output: 21
Explanation:
Product of digits = 4 * 4 * 2 * 1 = 32
Sum of digits = 4 + 4 + 2 + 1 = 11
Result = 32 - 11 = 21*/

public class SubtractTheProductAndSumOfDigitisOfAnInteger {
    public static void main(String[] args) {
        System.out.println(solution(234));
    }
    public static int solution(int n) {
        int temp = n;
        int sum = 0;
        int product = 1;
        while (temp > 0) {
            sum = sum + (temp % 10);
            temp /= 10;
        }
        temp = n;
        while (temp > 0) {
            product = product * (temp % 10);
            temp /= 10;
        }
        return product - sum;
    }
}
