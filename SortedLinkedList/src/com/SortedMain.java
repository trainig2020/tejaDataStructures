package com;

public class SortedMain {
public static void main(String[] args) {
	SortedLinkedList sl=new SortedLinkedList();
	System.out.println("List of Elements Before Sorting");
	sl.addNode(70);
	sl.addNode(21);
	sl.addNode(2);
	sl.addNode(98);
	sl.display();
	sl.sortList();
	System.out.println("List Of Elements After Sorting");
	sl.display();
	
}
}
