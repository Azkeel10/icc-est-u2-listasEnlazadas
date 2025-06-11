package Controllers;

import Models.Contact;
import Views.ConsoleView;

public class MenuController {
//-------------------------------------------------------------------------------
    private ContactManager contactManager = new ContactManager();
    private ConsoleView consoleView = new ConsoleView();
//-------------------------------------------------------------------------------
    public void showMenu() {
        int option;
        do {
            consoleView.displayMenu();
            option = Integer.parseInt(consoleView.getInput("Seleccione una opción:"));
            switch (option) {
                case 1 -> addContact();
                case 2 -> findContact();
                case 3 -> deleteContact();
                case 4 -> printList();
                case 5 -> consoleView.showMessage("Saliendo...");
                default -> consoleView.showMessage("Opción inválida.");
            }
        } while (option != 5);
    }
//-------------------------------------------------------------------------------
    private void addContact() {
        String name = consoleView.getInput("Nombre:");
        String phone = consoleView.getInput("Teléfono:");
        Contact<String, String> contact = new Contact<>(name, phone);
        contactManager.addContact(contact);
        consoleView.showMessage("Contacto añadido.");
    }
//-------------------------------------------------------------------------------
    private void findContact() {
        String name = consoleView.getInput("Nombre a buscar:");
        Contact<String, String> contact = contactManager.findContactByName(name);
        if (contact != null) {
            consoleView.showMessage("Contacto encontrado: " + contact);
        } else {
            consoleView.showMessage("Contacto no encontrado.");
        }
    }
//-------------------------------------------------------------------------------
    private void deleteContact() {
        String name = consoleView.getInput("Nombre a eliminar:");
        contactManager.deleteContactByName(name);
        consoleView.showMessage("Contacto eliminado si existía.");
    }
//-------------------------------------------------------------------------------
    private void printList() {
        consoleView.showMessage("Lista de contactos:");
        contactManager.printList();
    }
//-------------------------------------------------------------------------------
    
}
