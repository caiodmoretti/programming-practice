import java.util.Stack;

public class ReversePrefixOfWord {
    public static void main(String[] args) {

    }
    public static String solution(String word, char ch){
        String ans = "";

        Stack stack = new Stack();
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ch){
                for(int j = 0; j <= i; j++){
                    stack.push(word.charAt(j));
                }
            }
        }
        for(int i = 0; i < word.length(); i++){
            if(i <= stack.size()-1){
                ans += stack.pop();
            }else{
                ans += word.charAt(i);
            }
        }
        return ans;
    }
}
