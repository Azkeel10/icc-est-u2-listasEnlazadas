import Controllers.MenuController;

public class App {
    public static void main(String[] args) throws Exception {
//-------------------------------------------------------------------------------
        System.out.println("\n----------Programa Funcionando----------");
//-------------------------------------------------------------------------------
        MenuController controller = new MenuController();
        controller.showMenu();
//-------------------------------------------------------------------------------
        System.out.println("\n----------Programa Terminado----------");
    }
}
