public class SplitAStringInBalancedString {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(solution(s));
    }
    public static int solution(String s){
        int count = 0;
        int balance = 0;
        // Percorre cada caractere na string
        for (char c : s.toCharArray()) {
            // Incrementa ou decrementa a variável de equilíbrio
            if (c == 'L') {
                balance++;
            } else if (c == 'R') {
                balance--;
            }
            // Sempre que o equilíbrio for 0, significa que encontramos uma substring balanceada
            if (balance == 0) {
                count++;
            }
        }
        return count;
    }
}
