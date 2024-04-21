package com.practiceJava;

public class Employee {
	private int eid;
	private String name;
	private double salary;
	private static String orgname;
	
	//default constructor
	public Employee()
	{
		eid=0;
		name="NA";
		salary=0;
	}
	//parameterized constructor
	public Employee(int eid,String name,double salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	
	
	
//	public void displayDetails()
//	{
//		System.out.println("eid:"+eid+" name:"+name+" salary: "+salary);
//	}
	@Override
	public String toString()
	{
		return ("eid:"+eid+" name:"+name+" salary: "+salary+" OrgName: "+orgname);
	}
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	public int getEid()
	{
		return eid;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double getSalary()
	{
		return salary;
	}
	public static void setOrg(String orgname)
	{
		Employee.orgname=orgname;
	}
	public static String getOrgname() {
		return orgname;
	}
	
}
