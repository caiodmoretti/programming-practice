public class SumOfAllSubsetXorTotals {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int[] nums2 = {5, 1, 6};

        System.out.println(solution(nums2));
    }
    public static int solution(int[] nums) {
        return subsetXORSumHelper(nums, 0, 0);
    }

    private static int subsetXORSumHelper(int[] nums, int index, int currentXOR) {
        if (index == nums.length) {
            return currentXOR;
        }

        // Exclude the current element and move to the next
        int exclude = subsetXORSumHelper(nums, index + 1, currentXOR);

        // Include the current element and move to the next
        int include = subsetXORSumHelper(nums, index + 1, currentXOR ^ nums[index]);

        // Sum of both excluding and including current element
        return exclude + include;
    }
}
