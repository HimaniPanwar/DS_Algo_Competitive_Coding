
public class middleNodeOfLinkedList {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode curr = head;
        
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        
        int pos = count/2;
        
        while(pos--!=0){
            head = head.next;
        }
        
        return head;
    }
}

//Problem Link : https://leetcode.com/problems/middle-of-the-linked-list/
