
public class mergeSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        ListNode temp = res;
        
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                res.next = list1;
                res = res.next;
                list1 = list1.next;
            }else{
                res.next = list2;
                res = res.next;
                list2 = list2.next;
            }
        }
        
        while(list1!=null){
            res.next = list1;
            res = res.next;
            list1 = list1.next;
        }
        
        while(list2!=null){
            res.next = list2;
            res = res.next;
            list2 = list2.next;
        }
        
        return temp.next;
    }
}
