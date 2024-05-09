package ManualArrayList.ManualLinkedList;

import java.util.Arrays;

public class MyLinkedList<T> implements MyList<T> {
    public Node<T> head;
    public int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(T e) {
        Node<T> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public T get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<T> current = head;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }
        return current.value;
    }

    @Override
    public boolean remove(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (i == 0) {
            head = head.next;
        } else {
            Node<T> prev = null;
            Node<T> current = head;
            for (int j = 0; j < i; j++) {
                prev = current;
                current = current.next;
            }
            prev.next = current.next;
        }
        size--;
        return true;
    }

    @Override
    public boolean remove(T e) {
        Node<T> prev = null;
        Node<T> current = head;
        while (current != null) {
            if (current.value.equals(e)) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    @Override
    public int indexOf(T e) {
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            if (current.value.equals(e)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public boolean contains(T e) {
        return indexOf(e) != -1;
    }

}
