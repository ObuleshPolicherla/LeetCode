package leetCode;


class _25_reverseNodeinKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
         ListNode temp=head;
        if (head == null || findKthNode(temp, k)==null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
       
        while (true) {
            ListNode kthNode = findKthNode(temp, k);
            if (kthNode == null)
                break;
            ListNode nextnode = kthNode.next;
            kthNode.next=null;
            ListNode newHead=reverseList(temp);
            prev.next=newHead;
            temp.next=nextnode;
            prev=temp;
            temp=nextnode;}
        return dummy.next;
    }

    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        if (head == null || head.next == null)
            return head;

        while (temp != null) {
            ListNode nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;

        }
        return prev;
    }

    public ListNode findKthNode(ListNode head, int k) {
        ListNode temp = head;
        int cnt = 1;
        while (cnt < k && temp != null) {
            temp = temp.next;
            cnt++;
        }
        return temp;

    }

}