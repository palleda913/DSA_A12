package in.linkedlist;


public class Question6 {

	ListNode head;
	
	public ListNode removeNNodes(ListNode head,int m,int n) {
		ListNode current=head;
		ListNode prev=null;
    	while(head!=null) {
    		 for (int i = 0; i < m && current != null; i++) {
                 prev = current;
                 current = current.next;
             }

             // Check if reached the end of the linked list
             if (current == null) {
                 break;
             }

             // Delete N nodes
             for (int i = 0; i < n && current != null; i++) {
                 current = current.next;
             }

             prev.next = current;
    	}
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
		Question6 node = new Question6();
        int m=2,n=2;
        // Create the linked list: 1->2->3->4->5->6
        node.head = new ListNode(1);
        node.head.next = new ListNode(2);
        node.head.next.next = new ListNode(3);
        node.head.next.next.next = new ListNode(4);
        node.head.next.next.next.next = new ListNode(5);
        node.head.next.next.next.next.next = new ListNode(6);


        ListNode result = node.removeNNodes(node.head,m,n);
        node.printLinkedList(result);
	}
}
