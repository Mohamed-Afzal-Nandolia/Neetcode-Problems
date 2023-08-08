package LinkedList.MergeTwoSortedLists;

//Solution 1 ->
public class mergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            }
            else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 == null) {
            tail.next = l2;
        }
        else {
            tail.next = l1;
        }
        return dummy.next;
    }
}

//Solution 2 ->
 class mergeTwoSortedLists {
     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;//dummy is a box, and we are using curr as a header or as a hand to put the values in it.
        while(l1!=null && l2!=null){//list1 = [1,2,4], list2 = [1,3,4]
            if(l1.val <= l2.val){
                 curr.next = l1;
                 l1 = l1.next;
                }
            else{
                 curr.next = l2;
                 l2 = l2.next;
               }
            curr = curr.next;//as we move the value of l1 after a match, we need to change the value of curr as well so therefore we used this here to change or append the value of curr
         }
         curr.next = l1!=null ? l1 : l2;
         return dummy.next;
    }
}