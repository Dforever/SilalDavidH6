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