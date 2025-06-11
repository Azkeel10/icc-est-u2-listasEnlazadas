package Views;

import java.util.Scanner;

public class ConsoleView {
//-------------------------------------------------------------------------------
    Scanner scanner = new Scanner(System.in);
//-------------------------------------------------------------------------------
    public void displayMenu(){
        System.out.println("----------Menu contactos----------");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Borrar contacto");
        System.out.println("4. Mostrar lista de contactos");
        System.out.println("5. Salir");
    }
//-------------------------------------------------------------------------------
    public String getInput(String  prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }
//-------------------------------------------------------------------------------
    public void showMessage(String message){
        System.out.println(message);
    }
}
