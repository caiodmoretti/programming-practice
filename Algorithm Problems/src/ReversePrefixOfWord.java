/*
Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
Return the resulting string.



Example 1:

Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
Example 2:

Input: word = "xyxzxe", ch = "z"
Output: "zxyxxe"
Explanation: The first and only occurrence of "z" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".
*/

public class ReversePrefixOfWord {
    public static void main(String[] args) {

    }
    public static String solution(String word, char ch){
        int index = word.indexOf(ch);

        // Se 'ch' não for encontrado, retorne a string original
        if (index == -1) {
            return word;
        }

        // Constrói a string invertida até o índice de 'ch' e concatena o restante
        StringBuilder reversedPart = new StringBuilder(word.substring(0, index + 1)).reverse();
        String remainingPart = word.substring(index + 1);

        return reversedPart.toString() + remainingPart;
    }
}
