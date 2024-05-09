package Menu;

import java.util.HashMap;

public class Menu {

   static private HashMap<Integer, MenuItem> menuItems = new HashMap<>();

    Menu(){
        menuItems = new HashMap<Integer, MenuItem>();
    }

   static void display(){
//        MenuItem menuItem = new MenuItem("cola",Controller1);
        menuItems.put(1,null);
        menuItems.put(5,null);
        System.out.println("MENU: ");
        for (Integer key : menuItems.keySet()){
            MenuItem menuItem = menuItems.get(key);
            System.out.println(key + " - " + menuItem.getText());
        }
    }

    void addMenuItem(int key, MenuItem menuItem){
        menuItems.put(key,menuItem);
    }

}

class ola{
    public static void main(String[] args) {
        Menu.display();
    }
}
