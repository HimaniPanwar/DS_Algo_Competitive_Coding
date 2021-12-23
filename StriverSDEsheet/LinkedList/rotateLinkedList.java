package StriverSDEsheet.LinkedList;

public class rotateLinkedList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        
        int len = 1;
        ListNode cur = head;
        
        while(cur.next!=null){
            len++;
            cur = cur.next;
        }
        
        k = k%len;
        cur.next = head;
        k = len-k;
        while(k-->0){
            cur = cur.next;
        }
        
        head = cur.next;
        cur.next = null;
        
        return head;
    }
}

//Problem Link: https://leetcode.com/problems/rotate-list/
