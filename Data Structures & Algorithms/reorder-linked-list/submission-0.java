class Solution {
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=slow.next;
        slow.next=null;
        ListNode head3=reverse(head2);
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(head3!=null){
            ListNode next1=head.next;
            ListNode next3=head3.next;
            head.next=head3;
            head3.next=next1;
            head=next1;
            head3=next3;
        }
        temp.next=null;
    }
    public ListNode reverse(ListNode head){
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
