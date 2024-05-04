package ManualArrayList.ManualLinkedList;

import ManualArrayList.MyArrayList;
import ManualArrayList.MyList;

import java.util.Arrays;

public class MyLinkedList implements MyList {

    String[] elements = new String[0];

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public boolean add(String e) {
        int newSize = size()+1;
        String[] elements = new String[newSize];
        //COPING ELEMENTS
        for (int i=0; i < this.elements.length ; i++){
            elements[i]=this.elements[i];
        }

        elements[newSize-1]= e;
        this.elements = elements;
        return true;
    }

    public boolean addTo(int ind, String e){
        int newSize = size()+1;
        String[] elements = new String[newSize];
        //COPING ELEMENTS
        for (int i=0; i < this.elements.length ; i++){
            elements[i]=this.elements[i];
        }
        //ADJUST ELEMENTS
        for (int i= elements.length-1; i > 0 ; i--){
            if(i>ind)
                elements[i]=elements[i-1];
        }
        elements[ind]= e;
        this.elements = elements;
        return true;
    }

    @Override
    public String get(int ind) {
        String element="Not found...";
        for(int i=0; i<this.elements.length ;i++){
            if(i==ind){
                element=this.elements[i];
            }
        }
        return element;
    }

    @Override
    public boolean remove(int ind) {
        String[] elements = new String[size()-1];

        for(int i=0; i<this.elements.length ;i++) {
            if(i!=ind)
                if(i>=elements.length)
                    elements[i-1]=this.elements[i];
                else elements[i]=this.elements[i];
        }
        this.elements=elements;
        return true;
    }

    @Override
    public boolean remove(String e) {
        String[] elements = new String[size()-1];

        for(int i=0; i<this.elements.length ;i++) {
            if(!this.elements[i].equals(e))
                if(i>=elements.length)
                    elements[i-1]=this.elements[i];
                else elements[i]=this.elements[i];
        }

        this.elements=elements;
        return true;
    }

    @Override
    public int indexOf(String e) {
        int ind=-1;
        for(int i=0; i<this.elements.length ;i++){
            if(this.elements[i].contains(e))
                ind=i;
        }
        return ind;
    }

    @Override
    public boolean contains(String e) {
        for(int i=0; i<this.elements.length ;i++){
            if(this.elements[i].contains(e)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return ">>> LinkedList: " + Arrays.toString(elements);
    }
}
