package LeetCode;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        String ans= new String();
        while(head!=null) {
            ans += head.val;
            head = head.next;
        }
        for(int i = 0 ; i < ans.length()/2 ; i++) {
            if(ans.charAt(i) != ans.charAt(ans.length()-1-i)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){

    }
}
