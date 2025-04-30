public class LinkedListInsertAtAnyPosition {
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
	public void insert(int data,int position){
		Node node = new Node(data);
		if(position == 1){
			node.next = head;
			head = node;
			return;
		}
		//optional logic
		else if(position>length()+1){
			System.out.println("You entered invalid position!!!");
			return;
		}//optional
		Node previous = head;
		int count = 1;
		while(count<position-1){
			previous=previous.next;
			count++;
		}
		Node current = previous.next;
		node.next=current;
		previous.next = node;
	}
	public static void main(String[] args){
		LinkedListInsertAtAnyPosition l = new LinkedListInsertAtAnyPosition();
	
		l.insert(5,1);
		l.insert(10,2);
		l.insert(15,3);
		l.insert(20,5);
		l.display();
	}
}