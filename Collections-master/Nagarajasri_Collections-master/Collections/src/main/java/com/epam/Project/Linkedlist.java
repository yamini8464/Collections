package com.epam.Project;

import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {
	public static void linkedList() {
        LinkedList<Integer> ll = new LinkedList<Integer>(){
        	{ 
                add(1); 
                add(2); 
                add(3);
                add(4);
                add(5);
                add(6);
                add(7);
                add(8);
                add(9);
                add(10);
            } 
        };
        System.out.println("Chose ur option among the following :");
        System.out.println("1.Fetching");
        System.out.println("2.Adding");
        System.out.println("3.Removing");
        System.out.println("4.Printing");
        System.out.println("Enter -1 to exit");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		while (choice != -1) {
			switch(choice) {
				case 1:System.out.println("ArrayList : " + ll);
					   System.out.println("Enter the index from where u want to fetch : ");
				       int ind = sc.nextInt();
				       System.out.println(ll.get(ind));
				       break;
				case 2:System.out.println("ArrayList : " + ll);
					   System.out.println("Enter the element u want to add : ");
				       int ele = sc.nextInt();
				       ll.add(ele);
				       System.out.println("ArrayList after adding element : " + ll);
				       break;
				case 3:System.out.println("ArrayList : " + ll);
					   System.out.println("Enter the index at which u want to remove the element : ");
				       int indToRemove = sc.nextInt();
				       ll.remove(indToRemove);
				       System.out.println("ArrayList after removing element : " + ll);
				       break;
				case 4:System.out.println("Elements in ArrayList are : ");
					   for (int i = 0; i < ll.size();i++) { 		      
			               System.out.print(ll.get(i)+" "); 		
			      	   }
					   break;
			    default:System.out.println("Enter choice among 1,2,3,4");
			}
			System.out.println("Choose ur option among the following :");
	        System.out.println("1.Fetching");
	        System.out.println("2.Adding");
	        System.out.println("3.Removing");
	        System.out.println("4.Printing");
	        System.out.println("Enter -1 to exit");
			choice = sc.nextInt();
		}

	}
}

