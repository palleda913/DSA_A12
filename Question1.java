package in.linkedlist;

public class Question1 {

	ListNode head;
	
    public ListNode removeMiddleNode(ListNode head) {
    	if(head==null || head.next==null)
    		return null;
    	
    	ListNode slow=head;
    	ListNode fast=head;
    	ListNode prev=null;
    	
    	while(fast!=null && fast.next!=null) {
    		fast=fast.next.next;
    		prev=slow;
    		slow=slow.next;
    	}
    	
    	prev.next=slow.next;
    	
		return head;
        
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
		Question1 node = new Question1();

        // Create the linked list: 1->2->3->4->5->6
        node.head = new ListNode(1);
        node.head.next = new ListNode(2);
        node.head.next.next = new ListNode(3);
        node.head.next.next.next = new ListNode(4);
        node.head.next.next.next.next = new ListNode(5);
        node.head.next.next.next.next.next = new ListNode(6);


        ListNode result = node.removeMiddleNode(node.head);
        System.out.println("After removing middle node");
        node.printLinkedList(result);
	}

}
