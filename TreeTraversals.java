package PracticeCoding;

 class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

 class TreeTraversals {
	
	Node root;

	TreeTraversals() {
		root = null;
	}

	void printPostorder(Node node) {
		if (node == null)
			return;
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.key + " ");
	}

	void printInorder(Node node) {
		if (node == null)
			return;
		// first recur on the left child
		printInorder(node.left);
		// print the data of the current node
		System.out.print(node.key + " ");
		// first recur on the right child
		printInorder(node.right);

	}
void printPreorder(Node node) {
	
	if(node == null)
		return;
	
	System.out.print(node.key + " ");
	printPreorder(node.left);
	printPreorder(node.right);
}
	void printPostorder() {
		printPostorder(root);
	}

	void printInorder() {
		printInorder(root);
	}

	void printPreorder() {
		printPreorder(root);
	}

	public static void main(String[] args) {
		TreeTraversals tree = new TreeTraversals();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		 tree.printPostorder();
		 //tree.printInorder();
		//tree.printPreorder();
	}

}
