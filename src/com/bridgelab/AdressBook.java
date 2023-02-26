package com.bridgelab;

public class AdressBook {
	String Fname;
	String Lname;
	String City;
	String State;
	String Zip;
	String Mnumber;
	String Email;
	

	public String getFname() {
		return Fname;
	}


	public void setFname(String fname) {
		Fname = fname;
	}


	public String getLname() {
		return Lname;
	}


	public void setLname(String lname) {
		Lname = lname;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public String getState() {
		return State;
	}


	public void setState(String state) {
		State = state;
	}


	public String getZip() {
		return Zip;
	}


	public void setZip(String zip) {
		Zip = zip;
	}


	public String getMnumber() {
		return Mnumber;
	}


	public void setMnumber(String mnumber) {
		Mnumber = mnumber;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


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
