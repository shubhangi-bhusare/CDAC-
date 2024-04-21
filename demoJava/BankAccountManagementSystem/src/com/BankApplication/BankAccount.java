package com.BankApplication;

public class BankAccount {
	private int AccNO;
	private String name;
	private double balance;
	
	public BankAccount(int AccNo, String name, double balance)
	{
		this.AccNO=AccNo;
		this.name=name;
		this.balance=balance;
		
	}
	 
	public void WithdrawMoney(double Amount)
	{
		if(balance<0)
		{
			System.out.println("Your balance is insufficient");
		}
		else
		{
			 balance=balance-Amount;
			 System.out.println("Your Total balance after Withdraw is: "+balance); 
		}
	}
	
	public void DepositMoney(double Amount)
	{
		balance=balance+Amount;
		System.out.println("Your Total Balance after depositing the money is:"+balance);
	}
	
	public void CheckBalance()
	{
		System.out.println("Your current balance is: "+balance);
	}
	

}
