public class LinkedListInsertAtBeginning {
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
	public void insertAtBeginning(int data){
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	public static void main(String[] args){
		LinkedListInsertAtBeginning l = new LinkedListInsertAtBeginning();
	
		l.insertAtBeginning(5);
		l.insertAtBeginning(10);
		l.insertAtBeginning(15);
		l.display();// 15 --> 10 --> 5 --> null
	}
}