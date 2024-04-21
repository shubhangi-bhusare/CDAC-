package com.practiceJava;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(1,"shubhangi",50000);
		Employee e1=new Employee(2,"shilpa",45000);
		//e.displayDetails();
		System.out.println(e.toString()); 
		System.out.println(e.getEid()); 
		e1.setEid(3);
		System.out.println(e1.getEid());
		e1.setName("payal");
		System.out.println(e1.getName());
		Employee.setOrg("iacsd");
		System.out.println(Employee.getOrgname());
		//System.out.println(e.toString());
		PrintToString.printDetails(e);
		

	}

}
