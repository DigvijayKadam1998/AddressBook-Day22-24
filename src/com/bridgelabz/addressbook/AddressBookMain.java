package com.bridgelabz.addressbook;

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
		userInterface.print(contactStore.getContactList());
	}
}
