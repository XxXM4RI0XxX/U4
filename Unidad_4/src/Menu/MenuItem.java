package Menu;

public class MenuItem {

    String option;
    Controller controller;

    MenuItem(String option, Controller controller){
        this.option=option;
        this.controller=controller;
    }
    public String getText(){
        return option;
    }

}
