package linkedlist;

public class LinkedList {

	public static void main(String[] args) {
		Node ll = new Node(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		
		ll.print();
		ll.printReverse();
	}

}
