package com.bridgelab;

import java.util.Scanner;

public class Main {
	static AdressBook adressbook;

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

	public static void main(String[] args) {
		Main object = new Main();
		object.Uc1_createcontact();
		System.out.println(adressbook);

	}
}
