package com.bridgelab;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static AdressBook adressbook;
    static ArrayList<AdressBook> adressBook=new ArrayList<AdressBook>();
	public void Uc1_createcontact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first name");
		String fname = sc.next();
		System.out.println("enter last name");
		String lname = sc.next();
		System.out.println("enter city name");
		String city = sc.next();
		System.out.println("enter state name");
		String state = sc.next();
		System.out.println("enter zip code");
		String zip = sc.next();
		System.out.println("enter mobile number");
		String mobile = sc.next();
		System.out.println("enter mail address");
		String email = sc.next();
		System.out.println("contact list created");
		adressbook = new AdressBook(fname, lname, city, state, zip, mobile, email);

	}
	public void Uc2_addingContacts() {
		adressBook.add(adressbook);
		System.out.println("contact list added");
	}

	public static void main(String[] args) {
		Main object = new Main();
		object.Uc1_createcontact();
		System.out.println(adressbook);
		System.out.println();
		object.Uc1_createcontact();
		object.Uc2_addingContacts();
		System.out.println(adressBook.get(0));

	}
}
