package com.arrayobjDemoPassByRef;

import java.util.Scanner;

public class ArrayUtility {
	public static void AcceptArrElemts(int []arr)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the numbers");
			arr[i]=sc.nextInt();
			
		}
		
	}
	public static void DisplayArrEle(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void SumofArray(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			 sum=sum+arr[i];
		}
		System.out.println(sum);
	}
	public static void MaxElement(int[] arr)
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>arr[max])
			{
				max=i;
			}
		}
		System.out.println(arr[max]);
	
	}
	public static void ArraySort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
	}

}
