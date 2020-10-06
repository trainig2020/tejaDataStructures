package com;

public class ConcatwoLists {
	
	
	public Node concatTwoLinkLists(Node list1, Node list2) {
		if (list1 == null) {
			return list2;

		}
		if (list2 == null) {
			return list1;

		}
		
		Node temp = null;
	   Node r = null;
	    r = list1;
	    temp = list1;
	    while (temp.nextNode != list1)
	    
	        temp = temp.nextNode;
	   // System.out.println("first data "+temp.data);
	    
	    temp.nextNode = list2;
	    temp = list2;
	    
	   // System.out.println("second data "+temp.data);
	    while (temp.nextNode != list2)
	    
	        temp = temp.nextNode;
	//    System.out.println("third data "+temp.data);
	    temp.nextNode = r;
	    
	    
	    return r;
	    

		
	}
}
