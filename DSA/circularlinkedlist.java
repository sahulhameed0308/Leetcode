
public class circularlinkedlist {
	 public static void main(String[] args) {
	        Node head = new Node(10);
	        Node second = new Node(20);
	        Node third = new Node(30);
	        head.next = second;
	        second.next = third;
	        third.next = head;
	        Node temp = head;
	        System.out.println("Circular Linked List:");
	        do {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != head);
	    }
	}
	class Node {
	    int data;
	    Node next;
	    Node(int data) {
	        this.data = data;
	    }


}
