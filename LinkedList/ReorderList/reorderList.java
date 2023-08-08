package LinkedList.ReorderList;

public class reorderList {
    public ListNode midNode(ListNode head){
        ListNode fast =  head, slow  =  head;
        while(fast.next!=null && fast.next.next!=null){
            fast =  fast.next.next;
            slow =  slow.next;
        }//this will mark all the nodes, head & tail of the first and second part
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode curr =  head, prev=  null, next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        
        ListNode midNode =  midNode(head);//tail of first part
        ListNode nextToMid =  midNode.next;//head of second part
        midNode.next = null;//breaking nodes to split
        ListNode p2 =  reverse(nextToMid);//passing the head of second half & and also this will be the head of the 2nd part
        
        ListNode p1 =  head ,p1Next;    
        while(p1 != null && p2 != null){
            p1Next =  p1.next;                                    
			p1.next =  p2;
			           
            p1 =  p2;
            p2=p1Next;                        
        }                
    }  
}