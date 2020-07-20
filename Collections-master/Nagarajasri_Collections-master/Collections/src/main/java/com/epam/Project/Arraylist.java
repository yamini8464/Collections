package com.epam.Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

	public static void arrayList() {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar = new ArrayList<Integer>(){ 
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
				case 1:System.out.println("ArrayList : " + ar);
					   System.out.println("Enter the index from where u want to fetch : ");
				       int ind = sc.nextInt();
				       System.out.println(ar.get(ind));
				       break;
				case 2:System.out.println("ArrayList : " + ar);
					   System.out.println("Enter the element u want to add : ");
				       int ele = sc.nextInt();
				       ar.add(ele);
				       System.out.println("ArrayList after adding element : " + ar);
				       break;
				case 3:System.out.println("ArrayList : " + ar);
					   System.out.println("Enter the index at which u want to remove the element : ");
				       int indToRemove = sc.nextInt();
				       ar.remove(indToRemove);
				       System.out.println("ArrayList after removing element : " + ar);
				       break;
				case 4:System.out.println("Elements in ArrayList are : ");
					   for (int i = 0; i < ar.size();i++) { 		      
			               System.out.print(ar.get(i)+" "); 		
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
		sc.close();
	}

}
