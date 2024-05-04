package ManualArrayList.ManualLinkedList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedListLore.lore();

//        MyLinkedList linkedList = new MyLinkedList();
//
//        linkedList.add("Bola");
//        linkedList.add("Juan");
//        linkedList.add("Amdy");
//        linkedList.addTo(1,"Koala");
//        System.out.println(linkedList);
    }
}

 class LinkedListLore {

     public static void lore() {

         LinkedList<String> link = new LinkedList<>();
        /*
        .add (Elm) = Añadir elemento en la ultima posición
        .add (int,Elm) = Añadir elemento en la posición int; no se pueden
        poner elementos en posiciones mayores al tamaño de la lista (int<link.size())
        .element() = Devuelve el elemento de la primera posición
        .get (int) = Devuelve el elemento en la posición int
        .contains (Obj) = Verifica si existe el elemento con las caracteristicas del Obj
        .offer (Elm) = Añade el elemento a la posición final de la fila
        .offerLast/First (Elm) = Añade el elemento al Final/Primero de la fila

         */

         link.add("ola");
         link.add("Adios");
         link.add("cola");
         link.add(2, "bola");
         link.add(4, "carro");
         System.out.println(link);
         System.out.println(link.element());
         System.out.println(link.get(2));
         System.out.println(link.contains("Adios"));
         System.out.println(link.descendingIterator());//?
         link.offerLast("Queso");
         link.offer("Lavadora");
         link.offerFirst("Tostadora");
         System.out.println(link);
         link.poll();
         System.out.println(link);
     }
}
