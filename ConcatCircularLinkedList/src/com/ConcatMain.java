package com;

public class ConcatMain {
	public static void main(String[] args) {
		CircularLinkedListDemo cl=new CircularLinkedListDemo();
		CircularLinkedListDemo cld=new CircularLinkedListDemo();
		cl.insert(11);
		cl.insert(37);
		cl.insert(13);
		cl.display();
		
		cld.insert(18);
		cld.insert(30);
		cld.insert(19);
		cld.display();
		
		cl.head = new ConcatwoLists().concatTwoLinkLists(cl.head, cld.head);
		cl.display();
		
		
	}
	
}
