package com.SingleArraydemoJavaa;

import java.util.Scanner;

public class SingleArrayOperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int size;
		int arr[]= {5,8,15,9,1,2,77,6,100};
		int n=arr.length;
		//System.out.println("enter the size of array");
		//Scanner sc=new Scanner(System.in);
		//size=sc.nextInt();
		//System.out.println("enter the array elements");
//		for(int i=0;i<arr.length;i++)
//		{
//			
//	       arr[i]=sc.nextInt();
//		}
		EntityClassSingleArrOpe obj=new EntityClassSingleArrOpe();
		  System.out.println("Maximum element from array is: "+obj.MaxElement( arr, n));  
		  System.out.println("Sum of the array elements is: "+obj.SumOfArray(arr, n));
		System.out.println("Average of array elements is: "+obj.AverageOfArray(arr, n));
		obj.ArrayEleSort(arr,n);
	System.out.println("Sorted array elements are:");
	for(int i=0;i<9;i++)
	{
		System.out.print(arr[i]+" ");
	}

	}

}
