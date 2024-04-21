package com.containementAdress;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad=new Address("pune",41109);
		Courier c=new Courier(1,"shubhangi",ad);
		System.out.println(c.toString());
		ad.setCity("mumbai");
		System.out.println(ad.getCity());
		ad.setPincode(42718);
		System.out.println(c);
		//second syntax o containment
		Courier c2=new Courier(2,"mahesh",new Address("mumbai",492713));
		System.out.println(c2);
	}

}
