package Menu;

import java.util.HashMap;

public class Menu {

    private HashMap<Integer, MenuItem> menuItems;

    Menu(){
        menuItems = new HashMap<Integer, MenuItem>();
    }

    void display(){
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
