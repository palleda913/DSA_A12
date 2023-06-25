package in.linkedlist;

public class Question5 {

	ListNode head;
	
	public ListNode detectAndRemoveLoop(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Find meeting point of slow and fast pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        // No loop found
        if (slow != fast) {
            return head;
        }else
        	fast.next=null;
        
        return head;
	}



	public static void main(String[] args) {
		Question5 node = new Question5();

        node.head = new ListNode(1);
        node.head.next = new ListNode(2);
        node.head.next.next = new ListNode(3);
        node.head.next.next.next = new ListNode(4);
        node.head.next.next.next.next=node.head.next;

        ListNode result = node.detectAndRemoveLoop(node.head);
        System.out.println(result.val);
	}

}
