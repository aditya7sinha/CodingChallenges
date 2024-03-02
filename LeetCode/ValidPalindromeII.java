package LeetCode;

public class ValidPalindromeII {
    private boolean palindrome(String s, int st, int l) {
        while(st < l) {
            if(s.charAt(st)!=s.charAt(l)){
                return false;
            }
            st++;
            l--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int start = 0, last = s.length()-1;
        while(start<last){
            if(s.charAt(start) != s.charAt(last)) {

                if (palindrome(s, start+1, last)) {
                    return true;
                }
                if (palindrome(s, start, last-1)) {
                    return true;
                }
                return false;
            }
            start++;
            last--;
        }
        return true;
    }
    public static void main(String[] args){
        String word= "abac";
        ValidPalindromeII validPalindromeII = new ValidPalindromeII();
        System.out.println(validPalindromeII.validPalindrome(word));
    }
}
