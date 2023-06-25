package in.linkedlist;


public class Question3 {

	ListNode head;
	
	int findNthFromEnd(int n) {
        if (head == null || n <= 0) {
            return -1; // Invalid input
        }

        ListNode first = head;
        ListNode second = head;

        for (int i = 0; i < n; i++) {
            if (first == null) {
                return -1; // N is out of bounds
            }
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second.val;
    }

    public static void main(String[] args) {
        Question3 linkedList = new Question3();

        // Create a linked list: 1->2->3->4->5
        linkedList.head = new ListNode(1);
        linkedList.head.next = new ListNode(2);
        linkedList.head.next.next = new ListNode(3);
        linkedList.head.next.next.next = new ListNode(4);
        linkedList.head.next.next.next.next = new ListNode(5);

        int n = 2;
        int nthNode = linkedList.findNthFromEnd(n);

        if (nthNode == -1) {
            System.out.println("Invalid input or N is out of bounds");
        } else {
            System.out.println("The " + n + "th node from the end is: " + nthNode);
        }
    }
}
