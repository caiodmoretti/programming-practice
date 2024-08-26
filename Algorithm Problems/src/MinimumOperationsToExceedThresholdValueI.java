/*You are given a 0-indexed integer array nums, and an integer k.

In one operation, you can remove one occurrence of the smallest element of nums.

Return the minimum number of operations needed so that all elements of the array are greater than or equal to k.



Example 1:

Input: nums = [2,11,10,1,3], k = 10
Output: 3
Explanation: After one operation, nums becomes equal to [2, 11, 10, 3].
After two operations, nums becomes equal to [11, 10, 3].
After three operations, nums becomes equal to [11, 10].
At this stage, all the elements of nums are greater than or equal to 10 so we can stop.
It can be shown that 3 is the minimum number of operations needed so that all elements of the array are greater than or equal to 10.
Example 2:

Input: nums = [1,1,2,4,9], k = 1
Output: 0
Explanation: All elements of the array are greater than or equal to 1 so we do not need to apply any operations on nums.*/
import java.util.Arrays;
public class MinimumOperationsToExceedThresholdValueI {
    public static void main(String[] args) {
        int[] nums1 = {2, 11, 10, 1, 3};
        int k1 = 10;
        System.out.println(solution(nums1, k1)); // Saída esperada: 3

        int[] nums2 = {1, 1, 2, 4, 9};
        int k2 = 1;
        System.out.println(solution(nums2, k2)); // Saída esperada: 0
    }
    public static int solution(int[] nums, int k) {
    // Ordenar o array em ordem crescente
        Arrays.sort(nums);

        int operations = 0;

        // Percorrer o array e contar quantos elementos são menores que k
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k) {
                operations++;
            } else {
                // Se o elemento é maior ou igual a k, podemos parar
                break;
            }
        }

        return operations;



    }
}
