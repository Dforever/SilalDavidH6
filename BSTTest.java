import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.Scanner;

public class BSTTest {
	public static void main(String args[]) throws FileNotFoundException {
		handleUser();
	}

	private static void handleUser() throws FileNotFoundException {
		int choice = 1;
		Scanner kybd = new Scanner(System.in);
		while (choice != 0) {
			BinarySearchTree bstree = new BinarySearchTree();
			File fileToRead = insertFile();
			if (fileToRead != null) {
				insertFromFile(fileToRead, bstree);
				System.out.println("-------------------------------------");
				System.out.println("Printing tree from input");
				bstree.print();
			} else {
				System.out.println("File not selected or not available");
			}
			System.out.print("Continue 0 = no; 1 = yes: ");
			choice = kybd.nextInt();
		}
	}