package linkedlist;

public class Node {
	Node next;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
	
	public void insert(int value) {
		if(next == null) {
			next = new Node(value);
		} else {
			next.insert(value);
		}
	}
	
	
	public void print() {
		System.out.println(data);
		if(next != null) {
			next.print();
		}
	}
	
	public void printReverse() {
		if(next != null) {
			next.printReverse();
		}
		System.out.println(data);
	}
	
}
