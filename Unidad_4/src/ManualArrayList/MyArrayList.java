package ManualArrayList;

public class MyArrayList<T> implements MyList<T>{

    String[] elements = new String[0];

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public boolean add(T e)  {
        int newSize = size()+1;
        String[] elements = new String[newSize];
        //COPING ELEMENTS
        System.arraycopy(this.elements, 0, elements, 0, this.elements.length);

        elements[newSize-1]= String.valueOf(e);
        this.elements = elements;
        return true;
    }

    @Override
    public T get(int ind) {
        T element=null;
        for(int i=0; i<this.elements.length ;i++){
            if(i==ind){
                element=(T)this.elements[i];
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
    public boolean remove(T e) {
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
    public int indexOf(T e) {
        int ind=-1;
        for(int i=0; i<this.elements.length ;i++){
            if(this.elements[i].equals(e))
                ind=i;
        }
        return ind;
    }

    @Override
    public boolean contains(T e) {
        for (String element : this.elements) {
            if (element.equals(e)) {
                return true;
            }
        }
        return false;
    }
}
