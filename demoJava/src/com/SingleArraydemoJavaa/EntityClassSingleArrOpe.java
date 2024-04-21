package com.SingleArraydemoJavaa;

public class EntityClassSingleArrOpe {
	//Function to print the Max element from array
	public int MaxElement(int arr[], int n)

	{
		int max=0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]>arr[max])
			{
				max=i;
			}
		}
		return arr[max];
	}
	
	//Function to print of Sum of the elements of array
	public int SumOfArray(int arr[],int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	
	//Function to print the Average of array elements
	
public float AverageOfArray(int arr[], int n)
{
	int avg,count=0,sum=0;
	for(int i=0;i<n;i++)
	{
		sum+=arr[i];
		count++;
	}
	return avg=sum/count;
}

//Function to print array elements in sorted order

public void ArrayEleSort(int arr[],int n)
{
	//int n=arr.length;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	//return arr[i];
}
	
}
