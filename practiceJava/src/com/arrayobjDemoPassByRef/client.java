package com.arrayobjDemoPassByRef;

import java.util.Scanner;

public class client {
	public static void main(String[] args)
	{
		int arr1[]=new int[5];
		while(true) {
		System.out.println("menu....");
		System.out.println("1.Accept 2.Display  3.Sum  4.max  5.Sort array 6.exit");
		System.out.println("Enter choice");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter array elements");
			ArrayUtility.AcceptArrElemts(arr1);
			break;
		case 2:
			System.out.println("Display array elements");
			ArrayUtility.DisplayArrEle(arr1);
			break;
		case 3:
			System.out.println("Sum of the array elements is");
			ArrayUtility.SumofArray(arr1);
			break;
		case 4:
			System.out.println("Max element from array is");
			ArrayUtility.MaxElement(arr1);
			break;
		case 5:
			System.out.println("sorted array elements are");
			ArrayUtility.ArraySort(arr1);
			break;
		case 6:
			System.out.println("exiting program");
			break;
		default:
			System.out.println("invalid choice");
		}
		
	}

}
}
