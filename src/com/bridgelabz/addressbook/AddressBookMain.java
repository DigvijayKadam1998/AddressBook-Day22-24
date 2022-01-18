package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook Program");

		AddressBook contact = new AddressBook();
		contact.setFirstName("Digvijay");
		contact.setLastName("Kadam");
		contact.setAddress("Satara pin-415518");
		contact.setCity("Satara");
		contact.setState("Maharashtra");
		contact.setZip("415518");
		contact.setPhoneNumber("8669057912");
		contact.setEmail("digvijaykadam007@gmail.com");

		
		ContactStore contactStore = new ContactStore();
		contactStore.add(contact);

		UserInterface userInterface = new UserInterface();
		Scanner scanner = new Scanner(System.in);
		boolean check = true;
		while (check) {
			System.out.println("Enter choice 1.Add the new contact\n 2.Edit Existing contact\n 3.exit");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1 : {
				AddressBook newContact = new AddressBook();
				userInterface.enterDetails(newContact);
				contactStore.add(newContact);
				System.out.println("Contact List after add");
				userInterface.print(contactStore.getContactList());
			}
			case 2 : {
				contactStore.edit();
				System.out.println("Contact List after edit");
				userInterface.print(contactStore.getContactList());
			}
			case 3 : check = false;
			}
		}
	}
}
