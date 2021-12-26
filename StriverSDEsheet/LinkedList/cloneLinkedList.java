package StriverSDEsheet.LinkedList;

public class cloneLinkedList {
    public Node copyRandomList(Node head) {
        
        Node cur = head;
        
        while(cur!=null){
            Node temp = new Node(0);
            temp.data = cur.data;
            temp.next = cur.next;
            cur.next = temp;
            cur = temp.next;
        }
        
        cur = head;
        
        while(cur!=null){
            
            if(cur.bottom!=null){
                cur.next.bottom = cur.bottom.next;
            }
            cur = cur.next.next;
        }
        
        Node back = head;
        Node front = head;
        
        Node dummy = new Node(0);
        Node res = dummy;
            
        while(back!=null){
            front = back.next.next;
            res.next = back.next;
            back.next = front;
            res = res.next;
            back = back.next;
            
        }
        
        return dummy.next;
    }
}

//Problem link : https://leetcode.com/problems/copy-list-with-random-pointer/
