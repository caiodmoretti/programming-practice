/*Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.


Example 1:

Input: n = 5
Output: 10
Explanation: The smallest multiple of both 5 and 2 is 10.
Example 2:

Input: n = 6
Output: 6
Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself.*/

public class SmallestEvenMultiple {
    public static void main(String[] args) {
    int value = 5;
    System.out.println(solution(value));

    }
    public static int solution(int n) {
        if(n % 2 == 0){
            return n; // If n is even, the smallest multiple is n itself
        }
        else{
            return n*2; // If n is odd, the smallest multiple is 2 * n
        }
    }
}
