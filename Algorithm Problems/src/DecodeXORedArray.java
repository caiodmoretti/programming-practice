public class DecodeXORedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        for(int nums : solution(nums1, 1))
            System.out.print(nums + " ");
    }
    public static int[] solution(int[] encoded, int first) {
        int[] result = new int[encoded.length+1];
        result[0] = first;
        for (int i = 1; i < encoded.length; i++) {
            result[i+1] = result[i] ^ encoded[i];
        }
        return result;
    }
}
