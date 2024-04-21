package com.containementAdress;

public class Courier {
	private int cid;
	private String name;
	private Address caddress;
	
	public Courier(int cid,String name,Address caddress)
	{
		this.cid=cid;
		this.name=name;
		this.caddress=caddress;
	}
	
	@Override
	public String toString()
	{
		return ("Cid"+cid+" name:"+name+" Adress:"+caddress.toString());
	}

}
