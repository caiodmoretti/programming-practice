/*You are given two strings s and t such that every character occurs at most once in s and t is a permutation of s.

The permutation difference between s and t is defined as the sum of the absolute difference between the index of the occurrence of each character in s and the index of the occurrence of the same character in t.

Return the permutation difference between s and t.
Example 1:

Input: s = "abc", t = "bac"

Output: 2

Example 2:

Input: s = "abcde", t = "edbac"

Output: 12*/

public class PermutationDifferenceBetweenTwoStrings {
    public static void main(String[] args) {
        String s = "abc";
        String t = "bac";
        System.out.println(solution(s, t));
        s = "abcde";
        t = "edbac";
        System.out.println(solution(s, t));
    }
    public static int solution(String s, String t){
        int ans = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            ans+=(Math.abs(i - t.indexOf(ch)));
        }
        return ans;
    }
}
