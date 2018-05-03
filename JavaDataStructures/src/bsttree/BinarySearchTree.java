package bsttree;

public class BinarySearchTree {

	public static void main(String[] args) {
		// Create root node
		Node bst = new Node(7);
		bst.insert(4);
		bst.insert(17);
		bst.insert(5);
		bst.insert(1);
		bst.insert(12);
		bst.insert(23);
		System.out.println(bst.contains(1));
		bst.printInOrder();
		
		
	}
}
