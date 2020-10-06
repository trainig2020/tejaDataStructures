package com;

public class CircularLinkedListDemo {

    protected Node head;
    protected Node tail;
	public void insert(int data){
    	Node newNode =new Node(data);
        if (head == null){
            head = newNode;
        }else {
            tail.setNextNode(newNode);
        }
        tail = newNode;
        tail.setNextNode(head);
    }
    public void delete(int data){
    	 Node currentNode = head;
         if (head != null){
             if (currentNode.getData() == data){
                 head = currentNode.getNextNode();
                 tail.setNextNode(head);
             }else {
                 while(currentNode.getNextNode() != head){
                     if (currentNode.getNextNode().getData() == data){
                         currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                         break;
                     }
                     currentNode = currentNode.getNextNode();
                 }
             }
         }
    }
   
    public void display() {  
        Node present = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            System.out.println("Nodes of the circular linked list: ");  
            
             do{  
                //Prints each node by incrementing pointer.  
                System.out.print(" "+ present.data);  
                present = present.nextNode;  
            }while(present != head);  
            System.out.println();  
       }  
    }
}