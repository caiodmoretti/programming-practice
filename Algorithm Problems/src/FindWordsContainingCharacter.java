/*You are given a 0-indexed array of strings words and a character x.

Return an array of indices representing the words that contain the character x.

Note that the returned array may be in any order.



Example 1:

Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.*/

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        String[] words = {"leet","code"};
        char x = 'e';
        System.out.println(solution(words,x));

        String[] words_2 = {"abc","bcd","aaaa","cbc"};
        x = 'a';
        System.out.println(solution(words_2,x));

        String[] words_3 = {"abc","bcd","aaaa","cbc"};
        x = 'z';
        System.out.println(solution(words_3,x));
    }
    public static ArrayList<Integer> solution(String[] words, char x){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i < words.length; i++){
            if(words[i].indexOf(x) != -1){
                ans.add(i);
            }
        }
        return ans;
    }
}
