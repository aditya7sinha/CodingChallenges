package LeetCode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode ne = null;
        while(curr!=null){
            ne = curr.next;
            curr.next= prev;
            prev = curr;
            curr = ne;
        }
        return prev;
    }
}
