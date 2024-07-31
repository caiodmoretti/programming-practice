/*Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].



Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
Example 2:

Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]*/

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] ans = solution(nums,n);
        for(int i = 0; i< ans.length; i++){
        System.out.print(ans[i] + " ");
        }
        System.out.println();
        int[] nums_2 = {1,2,3,4,4,3,2,1};
        n = 4;
        int[] ans_2 = solution(nums_2,n);
        for(int i = 0; i< ans_2.length; i++){
            System.out.print(ans_2[i] + " ");
        }


    }
    public static int[] solution(int[] nums,int n) {
        int[] ans = new int[2*n];

        for(int i = 0; i < n  ; i++){
            //assigns the i-th element from the first half of nums
            ans[2 * i] = nums[i];
            //assigns the corresponding element from the second half of nums to the (2*i + 1)-th
            ans[2 * i + 1] = nums[n + i];
        }
        return ans;
    }
}
