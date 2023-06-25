package in.linkedlist;

public class Question2 {

	ListNode head;
	
    public boolean detectLoop(ListNode head) {
    	if(head==null)
    		return false;
    	
    	ListNode slow=head;
    	ListNode fast=head;
    	
    	while(fast!=null && fast.next!=null) {
    		fast=fast.next.next;
    		slow=slow.next;
    		if(fast==slow)
    			return true;
    	}
    	
		return false;
        
    }


	public static void main(String[] args) {
		Question2 node = new Question2();

        node.head = new ListNode(1);
        node.head.next = new ListNode(2);
        node.head.next.next = new ListNode(3);
        node.head.next.next.next = new ListNode(4);
        node.head.next.next.next.next = node.head.next;


       System.out.println(node.detectLoop(node.head));
   
	}

}
