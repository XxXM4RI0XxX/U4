package ConversionDeTipos;

public class Main {

    public static void main(String[] args) {
        Parent obj = new Parent();
        if (obj instanceof classC){
            classC obj2 = (classC) obj;
            obj2.printBai();
            classA obj4 = obj2;
        } else if (obj instanceof classB){
            classB obj3 = (classB)  obj;
            obj3.printAdios();
        }
        /*
        Casteo ^^^^
        Tipo_X nombre_obj = (Tipo_X) obj_del_cual_se_convierte;
         */
    }

    static class Parent{
        public void printHello() {
            System.out.println("Hello");
        }
    }

    class classA extends Parent{

    }
    class classB extends Parent{
        public void printAdios(){
            System.out.println("Adios");
        }
    }

    class classC extends classA{
        public void printBai() {
            System.out.println("BAI");
        }
    }
}

