public class Node {
	//left node
    private Node left;
    //right node
    private Node right;
    //contents of the node
    private String contents;
    //count of instances
    private int count;

//This is the Constructor with all the data
	public Node(String Contents) {
        contents = Contents;
        left = null;
        right = null;
        count = 1;
    }

    //This is the Accessors with all data of the Node
	   	public String Contents() {
	        return contents;
	    }

		//This will get the left Node
	    public Node Left() {
	        return left;
	    }

		//This will get the right Node
	    public Node Right() {
	        return right;
	    }

		//This will get the Instance Count
	    public int getCount() {
	        return count;
    }

    //These are the Mutators that will set the data of the Node
	    public void Contents(String Contents) {
	        contents = Contents;
	    }

		//This will set the left Node
	    public void Left(Node NewLeft) {
	        left = NewLeft;
	    }

		//This will set the right Node
	    public void Right(Node NewRight) {
	        right = NewRight;
	    }

		//This will add an Instance to the Counter
	    public void addInstance() {
	        count = count + 1;
	    }

	    //This will remove an Instance away from the Counter
	    public void removeInstance() {
			count = count - 1;
	}

	 //This will Compare the Node and all of its data to a Node
	    public int compareTo(Node Comparison) {
	        return contents.compareTo(Comparison.Contents());
	    }

		//Using a String this will Compare the data if the Node
		public int compareTo(String Comparison) {
	        return contents.compareTo(Comparison);
	    }

		//This will Print the present Node
		public void print() {
			System.out.println(Contents() + " " + getCount());
		}
}