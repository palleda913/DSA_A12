package in.linkedlist;


public class Question4 {

	ListNode head;
	
	public boolean findPalindrome(ListNode head) {
		if(head== null)
			return false;
		ListNode fast=head;
		ListNode slow=head;
		ListNode prev;
		ListNode temp=null;
		while(fast.next !=null && fast!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		prev=slow;
		slow=slow.next;
		prev.next=null;
		while (slow!=null) {
			temp=slow.next;
			slow.next=prev;
			prev=slow;
			slow=temp;
		}
		fast=head;
		slow=prev;
		while (slow != null) {
            if (fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
		
		return true;
        
    }

    public static void main(String[] args) {
        Question4 node = new Question4();

        // Create a linked list: 1->2->3->4->5
        node.head = new ListNode('R');
        node.head.next = new ListNode('A');
        node.head.next.next = new ListNode('D');
        node.head.next.next.next = new ListNode('A');
        node.head.next.next.next.next = new ListNode('R');

        System.out.println(node.findPalindrome(node.head));
    }
}
