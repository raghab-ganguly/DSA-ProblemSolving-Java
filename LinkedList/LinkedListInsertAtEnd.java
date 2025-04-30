public class LinkedListInsertAtEnd {
	private Node head;
	private static class Node {
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public void display(){
		Node current = head;
		while(current != null){
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.println("null\n");
	}
	public void insertAtEnd(int data){
		Node node = new Node(data);
		if(head == null){
			head = node;
			return;
		}
		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = node;
	}
	public static void main(String[] args){
		LinkedListInsertAtEnd l = new LinkedListInsertAtEnd();
	
		l.insertAtEnd(5);
		l.insertAtEnd(10);
		l.insertAtEnd(15);
		l.display();
	}
}