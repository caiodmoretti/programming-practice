/*Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".
Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"*/

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(solution(address));
    }
    public static String solution(String address) {
        StringBuilder sb = new StringBuilder();
        String pontString = "[.]";
        for(int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if(ch == '.') {
                sb.append(pontString);
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
