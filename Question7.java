package in.linkedlist;


public class Question7 {

	ListNode head;
	
	public ListNode mergeTwoLists(ListNode head1,ListNode head2) {
		ListNode ptr1=head1;
		ListNode ptr2=head2;
		
		while (ptr1 != null && ptr2 != null) {
            ListNode firstNext = ptr1.next;
            ListNode secondNext = ptr2.next;

            ptr1.next = ptr2;
            ptr2.next = firstNext;

            ptr1 = firstNext;
            ptr2 = secondNext;
        }
		if (ptr2 != null) {
	        ListNode firstLast = getTail(head1);
	        firstLast.next = ptr2;
	    }
		return head1;
        
    }
	
	private ListNode getTail(ListNode head) {
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }
    
    void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }


	public static void main(String[] args) {
		Question7 node1 = new Question7();
        node1.head = new ListNode(5);
        node1.head.next = new ListNode(7);
        node1.head.next.next = new ListNode(17);
        node1.head.next.next.next = new ListNode(13);
        node1.head.next.next.next.next = new ListNode(11);
        
        Question7 node2=new Question7();
        node2.head = new ListNode(12);
        node2.head.next = new ListNode(10);
        node2.head.next.next = new ListNode(2);
        node2.head.next.next.next = new ListNode(4);
        node2.head.next.next.next.next = new ListNode(6);
    
        ListNode result = node1.mergeTwoLists(node1.head,node2.head);
        node1.printLinkedList(result);
	}
}
