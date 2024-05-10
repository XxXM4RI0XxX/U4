package ManualArrayList;

public interface MyList <T>{
    int size();
    boolean add(T e);
    T get(int i);
    boolean remove(int i);
    boolean remove(T e);
    int indexOf(T e);
    boolean contains(T e);

}

