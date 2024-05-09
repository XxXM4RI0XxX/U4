package MailValidator;

public class Main {

    public static void main(String[] args) {

        StringValidator value = Value -> Value.endsWith("@gmail.com");

        String correo = ConsoleReader.ReadString("Correo",value);
        if(!correo.isBlank())
            System.out.println("Correo valido: "+correo);
        else System.out.println("Correo no valido");
    }
}
