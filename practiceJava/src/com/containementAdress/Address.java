package com.containementAdress;

public class Address {
 private String city;
 private int pincode;
 

 public Address(String city, int pincode) {
	// TODO Auto-generated constructor stub
	this.city=city;
	 this.pincode=pincode;
}
public String toString()
 {
	 return ("City: "+city+" Pincode:"+pincode);
 }
public void setCity(String city)
{
	this.city=city;
}
public String getCity()
{
	return city;
}
public void setPincode(int pincode)
{
	this.pincode=pincode;
}
public int getPincode()
{
	return pincode;
}
}
