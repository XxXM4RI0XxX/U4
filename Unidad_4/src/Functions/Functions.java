package Functions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Functions {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        var x = 0; //var puede convertirse en cualquier tipo de dato, se puede usar cuando sea
        // pero no es recomendable sobreusarlo, por temas de confusion en las variables.

        numbers.add(2);
        numbers.add(7);
        numbers.add(13);
        numbers.add(6);



    }

    public static List<Integer> doubleNumbers(List<Integer> numbers){

        // Declarar la lista, nombre_lista.stream()[para poder modificarlo]
        // .map((parametro_clase) -> parametro_clase * 2)[Operar los valores]
        // .toList()[Para convertirlo a su tipo original];
//        var doubledNumbers = numbers
//                .stream()
//                .map((number) -> number * 2)
//                .toList();
//
//        return doubledNumbers;

        // Lo mismo que antes, pero...
        // . filter((parametro_clase) -> "Instrucciones") [Filtro para limitar los datos que entraran en .map]
//        var doubledNumbers = numbers
//                .stream()
//                .filter((number) -> number % 2 == 0)
//                .map((number) -> number * 2)
//                .toList();
//
//        return doubledNumbers;

        // Manera tradicional de hacerlo
//        List<Integer> doubledNumbers = new ArrayList<>();
//
//        for(int number : numbers){
//            doubledNumbers.add(number * 2);
//        }
//        return doubledNumbers;
        return null;
    }
}
