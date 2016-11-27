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