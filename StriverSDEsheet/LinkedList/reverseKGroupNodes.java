package StriverSDEsheet.LinkedList;

public class reverseKGroupNodes {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k==1)
            return head;
        
        ListNode dummy = new ListNode();               
        dummy.next = head;
        
        ListNode pre = dummy, curr = dummy, nex = dummy;
        int count = 0;
        
        while(curr.next!=null){
            curr=curr.next;
            count++;
        }

        while(count >= k){
            curr = pre.next;
            nex = curr.next;
            for(int i = 1; i < k; i++){
                curr.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = curr.next;
            }
            pre = curr;
            count-=k;
        }
        
        return dummy.next;
    } 
}
