package com.bridgelab;

public class AdressBook {
	String Fname;
	String Lname;
	String City;
	String State;
	String Zip;
	String Mnumber;
	String Email;
	

	
	public AdressBook(String fname, String lname, String city, String state, String zip, String mnumber, String email) {
		super();
		Fname = fname;
		Lname = lname;
		City = city;
		State = state;
		Zip = zip;
		Mnumber = mnumber;
		Email = email;
	}
	   public String toString() {
	        return "\nFirst name: "+Fname+"\nLast name: "+Lname
	                +"\nCity: "+City
	                +"\nState: "+State+"\nZip: "+Zip
	                +"\nPhone number: "+Mnumber+"\nEmail address: "+Email;
	    }
	
}
