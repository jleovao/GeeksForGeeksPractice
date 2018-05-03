package bsttree;

public class Node {
	Node left, right;
	int data;
	
	public Node (int data) {
		this.data = data;
	}
	
	public void insert (int value) {
		// If value is less than data, insert in left subtree 
		if (value <= data) {
			if (left == null) {
				left = new Node(value);
			}
			else {
				left.insert(value);
			}
		// If value is greater than data, insert in left subtree 
		} else {
			if (right == null) {
				right = new Node(value);
			}
			else {
				right.insert(value);
			}
		}	
	}
	
	// Similar to insert
	public boolean contains (int value) {
		if (value == data) {
			return true;
		} else if (value < data){
			if (left == null) {
				return false;
			} else {
				return left.contains(value);
			}
		} else {
			if (right == null) {
				return false;
			} else {
				return right.contains(value);
			}
		}
	}
	
	// InOrder prints the left subtree, then the root, then the right subtree.
	public void printInOrder() {
		// print left subtree
		if (left != null) {
			left.printInOrder();
		}
		
		// print root
		System.out.print(data + " ");
		
		// print right subtree
		if (right != null) {
			right.printInOrder();
		}
	}
	
	// InOrder  : print left, root, right
	// PreOrder : print root, left, right
	// PostOrder: print left, right, root 
}
