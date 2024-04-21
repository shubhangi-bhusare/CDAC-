package demoArray;

import java.util.Scanner;

public class AdditionMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int r,c;
		
		Scanner sc=new Scanner(System.in);
//		r=sc.nextInt();
//		c=sc.nextInt();
		int [][]arr;
		arr=new int[3][3];
		int [][]arr2;
		arr2=new int[3][3];
		int [][]res;
		res=new int[3][3];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				arr[i][j]=sc.nextInt();
				arr2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res.length;j++)
			{
				res[i][j]=arr[i][j]+arr2[i][j];
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
