package ManualArrayList;

public class Main {

    public static void main(String[] args) {

        MyArrayList ArrayList = new MyArrayList();

        ArrayList.add("Buenas");
        System.out.println("Arr[0]: "+ArrayList.get(0));
        ArrayList.add("Aloha");
        ArrayList.add("Bonjour");
        System.out.println("Size: "+ArrayList.size());
        System.out.println("Get [1]: "+ArrayList.get(1));
        ArrayList.remove("Aloha");
        ArrayList.remove(0);
        System.out.println("Contains 'Bonjour'?: "+ArrayList.contains("Bonjour"));
        ArrayList.add("Priviet");
        ArrayList.indexOf("Priviet");
    }
}
