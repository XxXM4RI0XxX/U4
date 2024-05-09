package Menu;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();
        String ola = "wa";
        System.out.println(ola);

        Menu mainMenu = new Menu();
        Controller1 controller1 = new Controller1();
        Controller2 controller2 = new Controller2();
        mainMenu.addMenuItem(1,new MenuItem("FIRST OPTION",controller1));
        mainMenu.addMenuItem(2,new MenuItem("SECOND OPTION",controller2));

        mainMenu.display();
    }
}

class Controller1 implements Controller{

    @Override
    public void execute(){
        Menu subMenu = new Menu();
        Controller1 controller1 = new Controller1(){
            @Override
            public void execute(){
                System.out.println("OPTION OF SUBMENU");
            }
        };
        Controller controller = () -> {
          //Clase lambda
        };
        // ó
        Controller controller2 = this::execute; //Referencia a metodo...
    }
}

class Controller2 implements Controller{

    @Override
    public void execute(){
        System.out.println("SECOND OPTION");
    }
}
