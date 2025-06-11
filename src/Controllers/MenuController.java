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
            option = Integer.parseInt(consoleView.getInput("\n Seleccione una opción: "));

            switch (option) {
                case 1 -> addContact();
                case 2 -> findContact();
                case 3 -> deleteContact();
                case 4 -> printList();
                case 5 -> consoleView.showMessage("\nAdios :3");
                default -> consoleView.showMessage("\nOpción inválida");
            }

        } while (option != 5);
    }
//-------------------------------------------------------------------------------
    private void addContact() {

        String name = consoleView.getInput("\nNombre: ");
        String phone = consoleView.getInput("\nTeléfono: ");
        
        Contact<String, String> contact = new Contact<>(name, phone);

        contactManager.addContact(contact);
        consoleView.showMessage("\nContacto añadido");
    }
//-------------------------------------------------------------------------------
    private void findContact() {

        String name = consoleView.getInput("\nNombre a buscar: ");
        Contact<String, String> contact = contactManager.findContactByName(name);

        if (contact != null) {
            consoleView.showMessage("\nContacto encontrado: " + contact);
        } else {
            consoleView.showMessage("\nContacto no encontrado");
        }
    }
//-------------------------------------------------------------------------------
    private void deleteContact() {

        String name = consoleView.getInput("\nNombre a eliminar: ");
        contactManager.deleteContactByName(name);
        consoleView.showMessage("\nContacto eliminado si existía");
    }
//-------------------------------------------------------------------------------
    private void printList() {

        consoleView.showMessage("\nLista de contactos: ");
        contactManager.printList();
    }
//-------------------------------------------------------------------------------

}
