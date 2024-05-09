package MailValidator;

import java.util.Scanner;

public class ConsoleReader {

    static Scanner q = new Scanner(System.in);

    public static String ReadString(String prompt, StringValidator stringValidator){

        boolean valid = false;
        String value = "";

        while (!valid){
            System.out.print(prompt + ":");
            value=q.nextLine();
            boolean isValid = stringValidator.validate(value);
            if(isValid)
                return value;
        }
        return "";
    }
}
