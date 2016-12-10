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

	 //Will give a directory listing of the current directory, user picks option for file selection
		private static File insertFile() {
			File f = new File("."); // current directory
			System.out.println(f.getName());

			//Locating files that are *.txt through a filenamefilter being utilized
			FilenameFilter textFilter = new FilenameFilter() {
				public boolean accept(File dir, String name) {
					return name.toLowerCase().endsWith(".txt");
				}
		};

		//Using this filter to retrieve a list of files
				File allfiles[] = f.listFiles(textFilter);
				if (allfiles.length > 0) {
					Scanner kybd = new Scanner(System.in);
					//Will loop to find a number that is actually in the list
					do {
						int userInput = 0;
						//Using the name and the index for oreder, will create a tally for all files
						for (int i = 0; i < allfiles.length; i++) {
							System.out.println(" " + (i+1) + " - " + allfiles[i].getName());
						}
						//Will print Enter your choice:
						System.out.print("Enter your choice: ");
						userInput = kybd.nextInt() -1;
						//verify user input
						if (userInput >= 0 && userInput < allfiles.length)
							return allfiles[userInput];
					} while (true);
				} else {
					//Will print Cannot find a .txt file in the current working directory no txt files are used
					System.out.println("Cannot find a .txt file in the current working directory");
				}
				return null;
	}