package LeetCode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode cur = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        cur.next = l1 == null ? l2 : l1;
        return prehead.next;
    }
    public static void main(String[] args){
        int[] a = {1,2,4};
        int[] b = {1,3,4};
        ListNode l1 = new ListNode(a[0]);
        l1.next = new ListNode(a[1]);
        l1.next.next= new ListNode(a[2]);
        ListNode l2 = new ListNode(b[0]);
        l2.next = new ListNode(b[1]);
        l2.next.next = new ListNode(b[2]);
        MergeTwoSortedLists m = new MergeTwoSortedLists();
        System.out.println(m.mergeTwoLists(l1,l2));
    }
}
