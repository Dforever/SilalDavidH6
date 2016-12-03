public class BinarySearchTree {
	private Node root;

	//This will place data to the Binary Tree
	public void insert(String data) {
		//This will make a new node for the data
		Node newNode = new Node(data);
		//This sees if the tree is empty or not
		if (root == null) {
			root = newNode;
		} else {
			//loop node
			Node seeker = root;
			//immediate master node
			Node master = null;
			//infinite loop
			while (true) {
				//current master is now the previous seeker
				master = seeker;
				//This is a String that will retrieve the Comparison Results
				int compareResult = seeker.compareTo(data);
				//This will check the comparison
				if (compareResult == 0) {
					//The comparison result is found to be equal
					//This will increment the new position
					seeker.increment();
					break;
				} else if (compareResult > 0) {
					//Since comparison reult is greater you go left
					seeker = seeker.Left();
					if (seeker == null) {
						//The new node will now join in
						master.Left(newNode);
						break;
					}
				} else {
					//Since comparison result is greater you go right
					seeker = seeker.Right();
					if (seeker == null) {
						//The new node will now join in
						master.Right(newNode);
						break;
					}
				}
			}
		}
	}

//This will print the nodes out in a correctly aligned way starting from the bottom node max left
	public void print() {
		if (root == null) {
			System.out.println("Tree is empty");
		} else {
			System.out.print("Root is ");
			if (root != null) root.print();
			printInorder(root);
		}
	}

//This is a Recursive Function that will print out the Nodes correctly aligned
	private void printInorder(Node start) {
		if(start != null) {
			//go down the left side of this node
			printInorder(start.Left());
			if (start != null) start.print();
			//go down the right side of this node
			printInorder(start.Right());
		}
	}

//This will retrieve the successor node for the present Delete Tree
	private Node getSuccessor(Node deleteNode) {
		Node seeker = null;
		Node master = null;
		Node current = deleteNode.Right();

		while (current != null) {
			master = seeker;
			seeker = current;
			current = current.Left();
		}

		if (seeker != deleteNode.Right()) {
			seeker.Right(deleteNode.Right());
			master.Left(seeker.Right());
		}

		return seeker;
	}

	//This will figure out whether the String is in the tree or not
		public boolean search(String data) {
			//Imitates delete to locate the node
			Node master = root;
			Node seeker = root;

			int dataDiff = 0;
			do {
				dataDiff = seeker.compareTo(data);
				if (dataDiff != 0) {
					master = seeker;
					if(dataDiff > 0){
						seeker = seeker.Left();
					} else {
						seeker = seeker.Right();
					}
					if(seeker == null){
						return false;
					}
				}
			} while (dataDiff != 0);
			return true;
	}