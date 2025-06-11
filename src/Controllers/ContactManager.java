package Controllers;

import java.util.LinkedList;
import Models.Contact;

public class ContactManager {
//-------------------------------------------------------------------------------
    private LinkedList<Contact<String, String>> contacts = new LinkedList<>();
//-------------------------------------------------------------------------------
    public void addContact(Contact<String, String> contact) {
        contacts.appendToTail(contact);
    }
//-------------------------------------------------------------------------------
    public Contact<String, String> findContactByName(String name) {
        Node<Contact<String, String>> current = contacts.getHead();
        while (current != null) {
            if (current.getValue().getName().equals(name)) {
                return current.getValue();
            }
            current = current.getNode();
        }
        return null;
    }
//-------------------------------------------------------------------------------
    public void deleteContactByName(String name) {
        Node<Contact<String, String>> current = contacts.getHead();
        while (current != null) {
            if (current.getValue().getName().equals(name)) {
                contacts.deleteByValue(current.getValue());
                return;
            }
            current = current.getNext();
        }
    }
//-------------------------------------------------------------------------------
    public void printList() {
        contacts.print();
    }
//-------------------------------------------------------------------------------
}

