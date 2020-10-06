package com;

import java.util.Scanner;

import com.Sorting.BST;

public class Main {
	public static void main(String a[]) {
		Sorting sort = new Sorting();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
       int n = scan.nextInt();
        int ar[] = new int[n];
        
		
		
		
		while (true) {
			System.out.println("\n");
			System.out.println("\n.....Sorting techniques...");
			System.out.println("1. Bubble Sort");
			System.out.println("2. Selection Sort");
			System.out.println("3. Insertion Sort");
			System.out.println("4. Merge Sort ");
			System.out.println("5. Quick Sort");
			System.out.println("6. Shell Sort");
			System.out.println("7. Heap Sort");
			System.out.println("8. Radix Sort");
			System.out.println("9. Binary Tree Sort");
			System.out.println("10. Exit");
			
			System.out.println("\n Enter your choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("\n Enter " + ar.length+" elements :");
				for(int i = 0; i < ar.length; i++)
		        {
		            ar[i] = scan.nextInt();
		        }
				System.out.println("Before Sorting:");
				sort.display(ar);
				sort.bubbleSort(ar);
				System.out.println("\n After Bubble Sort :");
				sort.display(ar);
				break;
				
			case 2:
				System.out.println("\n Enter " + ar.length+" elements :");
				for(int i = 0; i < ar.length; i++)
		        {
		            ar[i] = scan.nextInt();
		        }
				System.out.println("Before Sorting:");
				sort.display(ar);
				sort.selectionSort(ar);
				System.out.println("\n After Selection Sort :");
				sort.display(ar);
				break;
			case 3:
				System.out.println("\n Enter " + ar.length+" elements :");
				for(int i = 0; i < ar.length; i++)
		        {
		            ar[i] = scan.nextInt();
		        }
				System.out.println("Before Sorting:");
				sort.display(ar);
				sort.InsertionSort(ar);
				System.out.println("\n After Insertion Sort :");
				sort.display(ar);
				break;
			case 4:
				System.out.println("\n Enter " + ar.length+" elements :");
				for(int i = 0; i < ar.length; i++)
		        {
		            ar[i] = scan.nextInt();
		        }
				System.out.println("Before Sorting:");
				sort.display(ar);
				sort.sort(ar, 0, ar.length-1);
				System.out.println("\n After Merge Sort :");
				sort.display(ar);
				break;
				
			case 5:
				System.out.println("\n Enter " + ar.length+" elements :");
				for(int i = 0; i < ar.length; i++)
		        {
		            ar[i] = scan.nextInt();
		        }
				System.out.println("Before Sorting:");
				sort.display(ar);
				sort.quickSort(ar, 0, ar.length-1);
				System.out.println("\n After Quick Sort :");
				sort.display(ar);
				break;
			case 6:
				System.out.println("\n Enter " + ar.length+" elements :");
				for(int i = 0; i < ar.length; i++)
		        {
		            ar[i] = scan.nextInt();
		        }
				System.out.println("Before Sorting:");
				sort.display(ar);
				sort.shellSort(ar, ar.length);
				System.out.println("\n After Shell Sort :");
				sort.display(ar);
				break;
			case 7:
				System.out.println("\n Enter " + ar.length+" elements :");
				for(int i = 0; i < ar.length; i++)
		        {
		            ar[i] = scan.nextInt();
		        }
				System.out.println("Before Sorting:");
				sort.display(ar);
				sort.heapSort(ar);
				System.out.println("\nAfter Heap Sort :");
				sort.display(ar);
				break;
			case 8:
				System.out.println("\n Enter " + ar.length+" elements :");
				for(int i = 0; i < ar.length; i++)
		        {
		            ar[i] = scan.nextInt();
		        }
				System.out.println("Before Sorting:");
				sort.display(ar);
				sort.radixSort(ar, ar.length);
				System.out.println("\n After Radix Sort :");
				sort.display(ar);
				break;
			case 9:
				System.out.println("\n Enter " + ar.length+" elements :");
				for(int i = 0; i < ar.length; i++)
		        {
		            ar[i] = scan.nextInt();
		        }
				System.out.println("Before Sorting:");
				sort.display(ar);
				BST bst = sort.new BST(ar[0]);
			    for(int num : ar){
			      bst.insert(bst.node, num);
			    }
			    System.out.print("\nSorted Array after Tree sort- ");
			    bst.inOrder(bst.node);
		        break;
			case 10:
				System.out.println("Exiting......");
				System.exit(0);
				
			 default : 
	                System.out.println("Wrong Entry \n ");
	                break; 
				
			}
	}

}
}
