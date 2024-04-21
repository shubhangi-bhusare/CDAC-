package com.BankApplication;

import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BankAccount b=new BankAccount(1,"shubhangi",70000);
     BankAccount b1=new BankAccount(2,"shilpa",50000);
//     b.DepositMoney(7000);
//     b.WithdrawMoney(2000);
     Scanner sc=new Scanner(System.in);
     int choice;
    
     do{
     System.out.println("1.Deposit 2.Withdraw 3.checkBalance 4.Exit");
     System.out.println("Enter your choice");
     choice=sc.nextInt();
     switch(choice)
     {
     case 1:
    	 System.out.println("Enter the amount which you want to deposit");
    	 double depAmount=sc.nextDouble();
    	 b.DepositMoney(depAmount);
    	 break;
    	 
     case 2:
    	 System.out.println("Enter the amount which you want to withdraw");
    	 double witAmount=sc.nextDouble();
    	 b.WithdrawMoney(witAmount);
    	 break;
     case 3:
    	 b.CheckBalance();
    	 break;
    	 
     case 4:
    	 System.out.println("Exit");
    	 break;
     default:
    	 System.out.println("Invalid choice");
    	 }
     }while(choice!=4);
    
     sc.close();
	}

}
