public class LinkedListImpl {
	private Node head;
	
	private static class Node {
		private int data;
		private Node next;
		
		private Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void display(){
		Node current = head;
		while(current != null){
			System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.print("null\n\n");
	}
	
	public int length(){
		if(head == null){
			return 0;
		}
		int count = 0;
		Node current = head;
		while(current != null){
			count++;
			current = current.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		LinkedListImpl linkedList = new LinkedListImpl();
		
		linkedList.head = new Node(5);
		Node second = new Node(10);
		Node third = new Node(15);
		Node fourth = new Node(20);
		
		linkedList.head.next = second;
		second.next = third;
		third.next = fourth;
		
		linkedList.display();
		
		System.out.println("Length of the Linkedlist:: "+linkedList.length());
	}
}