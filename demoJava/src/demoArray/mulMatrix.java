package demoArray;

import java.util.Scanner;

public class mulMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		r=sc.nextInt();
//		c=sc.nextInt();
		int [][]arr;
		arr=new int[2][2];
		int [][]arr2;
		arr2=new int[2][2];
		int [][]res;
		res=new int[2][2];
		System.out.println("Enter the array elements");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=sc.nextInt();
				arr2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				res[i][j]=0;
				for(int k=0;k<2;k++)
					
				res[i][j]+=arr[i][j]*arr2[i][j];
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		
		//printing the array element
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}

	

	}

}
