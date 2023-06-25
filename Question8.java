package in.linkedlist;

public class Question8 {

	ListNode head;
	
    public boolean detectCircularLoop(ListNode head) {
    	if(head==null)
    		return false;
    	
    	ListNode slow=head;
    	ListNode fast=head;
    	
    	while(fast!=null && fast.next!=null) {
    		fast=fast.next.next;
    		slow=slow.next;
    		if(fast==head && slow==head)
    			return true;
    		else if(fast==slow) {
    			return false;
    		}
    		
    	}
    	
		return false;
        
    }


	public static void main(String[] args) {
		Question8 node = new Question8();

        node.head = new ListNode(10);
        node.head.next = new ListNode(12);
        node.head.next.next = new ListNode(14);
        node.head.next.next.next = new ListNode(16);
        node.head.next.next.next.next = node.head;


        if(node.detectCircularLoop(node.head)) {
        	System.out.println("Circular");
        }
        else
        	System.out.println("Not circular");
   
	}

}
