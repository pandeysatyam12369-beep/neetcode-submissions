class Solution {
    public ListNode reverseList(ListNode head) {
       
        ListNode f=null;
        ListNode t=null;
        ListNode c=head;
        while(c!=null){
            f=c.next;
            c.next=t;
            t=c;
            c=f;
        }
        return t;
    }
}
