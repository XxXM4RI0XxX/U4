package ManualArrayList.ManualLinkedList;

public interface MyList <T>{
    int size();
    boolean add(T e);
    T get(T i);
    boolean remove(T i);
    boolean remove(T e);
    int indexOf(T e);
    boolean contains(T e);
}

