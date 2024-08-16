import java.util.Arrays;
import java.util.List;

public class SumOfValuesAtIndicesWithKSetBits {
    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(5,10,1,5,2);
        int k = 1;
        System.out.println(solution((List<Integer>) nums1,k));
    }
    public static int solution(List<Integer> nums, int k){
        int sum = 0;
        for(int i=0; i<nums.size(); i++){
            if(Integer.bitCount(i) == k){
                sum += nums.get(i);
            }
        }
        return sum;
    }
}
