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
					seeker.addInstance();
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

