package com.bridgelab;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	  Main book=new Main();
	static AdressBook adressbook;
    static ArrayList<AdressBook> adressBook=new ArrayList<AdressBook>();
    String SearchByName;
    int option;
    Scanner sc=new Scanner(System.in);
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
	public void Uc3_edit() {
		if(adressBook.get(0).getFname().equalsIgnoreCase(SearchByName)) {
		System.out.println("eneter name respectively\n1.First name 2.last name 3.state" +"4.city 5.zip 6.mobile number 7.email");
		int option=sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("enter first name to edit");
			adressBook.get(0).setFname(sc.next());
			break;
		case 2:
			System.out.println("enter last name to edit");
			adressBook.get(0).setLname(sc.next());
			break;
		case 3:
			System.out.println("enter city to edit");
			adressBook.get(0).setCity(sc.next());
			break;
		case 4:
			System.out.println("enter state to edit");
			adressBook.get(0).setState(sc.next());
			break;
		case 5:
			System.out.println("enter zip to edit");
			adressBook.get(0).setZip(sc.next());
			break;
		case 6:
			System.out.println("enter mobile number to edit");
			adressBook.get(0).setMnumber(sc.next());
			break;
		case 7:
			System.out.println("enter mail to edit");
			adressBook.get(0).setEmail(sc.next());
			break;
			default:
				System.out.println("entered invalid option");
				
		}
		}
		else {
			System.out.println("entered wrong option");
	}
	}

	public static void main(String[] args) {
		Main object = new Main();
		object.Uc1_createcontact();
		System.out.println(adressbook);
		System.out.println();
		object.Uc1_createcontact();
		object.Uc2_addingContacts();
		System.out.println(adressBook.get(0));
		object.Uc3_edit();

	}
}
