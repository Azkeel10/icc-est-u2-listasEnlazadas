package Controllers;

import Models.LinkedList;
import Models.Contact;

public class ContactManager {
//-------------------------------------------------------------------------------
    private LinkedList<Contact<String, String>> contacts = new LinkedList<>();

    public void addContact(Contact<String, String> contact) {
        contacts.appendToTail(contact);
    }

    public Contact<String, String> findContactByName(String name) {
        return contacts.findByValue(new Contact<>(name, ""));
    }

    public void deleteContactByName(String name) {
        contacts.deleteByValue(new Contact<>(name, ""));
    }

    public void printList() {
        contacts.print();
    }
}

