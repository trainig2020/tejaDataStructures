import java.util.Scanner;


public class Searching {
	// Represent a node of the singly linked list
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// Represent the head and tail of the singly linked list
	public Node head = null;
	public Node tail = null;

	// addNode() will add a new node to the list
	public void addNode(int data) {
		// Create a new node
		Node newNode = new Node(data);

		// Checks if the list is empty
		if (head == null) {
			// If list is empty, both head and tail will point to new node
			head = newNode;
			tail = newNode;
		} else {
			// newNode will be added after tail such that tail's next will point to newNode
			tail.next = newNode;
			// newNode will become new tail of the list
			tail = newNode;
		}
	}

	// display() will display all the nodes present in the list
	public void display() {
		// Node current will point to head
		Node current = head;

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linked list: ");
		while (current != null) {
			// Prints each node by incrementing pointer
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void LinearsearchValue(int data) {
		int pos = 0;
		Node present = head;

		boolean flag = false;

		if (head == null) {
			System.out.println("List is Empty ");
		} else {

			while (present != null) {
				if (present.data == data) {
					flag = true;
					break;
				} else {
					present = present.next;
					pos++;
				}
			}
		}
		if (flag) {
			System.out.println("data is present in the list" + " At position " + pos);
		} else {
			System.out.println("data is not found");
		}
	}

	public static Node middleNode(Node start, Node last) {
		if (start == null)
			return null;

		Node slow = start;
		Node fast = start.next;

		while (fast != last) {
			fast = fast.next;
			if (fast != last) {
				slow = slow.next;
				fast = fast.next;
			}
		}
		return slow;
	}

	public static Node binarySearch(Node head, int value) {
		Node start = head;
		Node last = null;

		do {
			// Find Middle
			Node mid = middleNode(start, last);

			// If middle is empty
			if (mid == null)
				return null;

			// If value is present at middle
			if (mid.data == value)
				return mid;

			// If value is less than mid
			else if (mid.data < value) {
				start = mid.next;
			}

			// If the value is more than mid.
			else
				last = mid;
		} while (last == null || last != start);

		// value not present
		return null;
	}

	public void displayBinary(Node check) {
		if (check == null) {
			System.out.println("Value  Is Not present");
		} else {
			System.out.println(check.data + " Is Present");
		}
	}

	public void deleteNode(int position) {
		// If linked list is empty
		if (head == null)
			return;

		// Store head node
		Node temp = head;

		// If head needs to be removed
		if (position == 0) {
			head = temp.next; // Change head
			return;
		}

		// Find previous node of the node to be deleted
		for (int i = 0; i < position - 1; i++)
			temp = temp.next;
		// Node temp->next is the node to be deleted
		// Store pointer to the next of node to be deleted
		Node next = temp.next.next;

		temp.next = next; // Unlink the deleted node from list
	}
	public static void main(String[] args) {
		char ch;
		Searching sList = new Searching();
		int[] arr = {10,6,15,4,1,45};
		do {
			System.out.println("Enter the order number to perform operation on LinkedList : ");
			System.out.println(".........................1.Display Nodes................................");
			System.out.println(".........................2.Add element.................................");
			System.out.println(".........................3.Linear Searching of Node.................................");
			System.out.println(".........................4.Binary Searching of Node .......................");
			System.out.println(".........................5.Delete Node.................");
			
			Scanner sc = new Scanner(System.in);

			int x = sc.nextInt();
			switch (x) {

			case 1:
				sList.display();
				break;
			case 2:
				System.out.println("Add Elements");
				Scanner scc = new Scanner(System.in);
				sList.addNode(scc.nextInt());
				break;
			case 3:
				System.out.println("Enter Element to Search ");
				Scanner scm = new Scanner(System.in);
				sList.LinearsearchValue(scm.nextInt());
				break;
			
				
			case 4:
				System.out.println("Enter Element to Search ");
				Scanner scl = new Scanner(System.in);
				int y = scl.nextInt();
				Node check = Searching.binarySearch(sList.head, y);
				sList.displayBinary(check);
				break;

			case 5:
				sList.display();
				System.out.println("Enter the  position to delete");
				Scanner sce = new Scanner(System.in);
				sList.deleteNode(sce.nextInt());
				sList.display();
				System.out.println("Node is deleted  ");
				break;
				
			
			default:
				System.out.println("Wrong input\n");

			}
			System.out.println("Do you want to continue ? (Y/N)");

			Scanner acb = new Scanner(System.in);
			ch = acb.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}

