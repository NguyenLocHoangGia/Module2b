package DSA.List.ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];

    public MyList(int length){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList() {

    }

    public void ensureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(int index, E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++]=elements[elements.length-1];
        for (int i = elements.length-1; i >index ; i--) {
            elements[i]=elements[i-1];
        }
        elements[index]=e;
    }
    public E remove(int index){
        while (index >= index){
            System.out.println("Out of range");
        }
        E removedElement = (E) elements[index];

        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[size - 1] = null;
        size--;

        return removedElement;

    }
    public int size(){
        return size;
    }
    public E clone(){
        MyList<E>clonedList = new MyList<>(elements.length);
        clonedList .size = size;
        System.arraycopy(elements, 0, clonedList.elements, 0, size);
        return (E) clonedList;
    }
    public int indextOf(E o){
        if (o == null){
            for (int i = 0; i < size; i++) {
                if (elements[i] == null){
                    return i;
                }
            }
        }else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])){
                    return i;
                }
            }
        }
        return -1;
    }
    public void ensureCapacity(int minCapacity) {
        int currentCapacity = elements.length;
        if (minCapacity > currentCapacity) {
            int newCapacity = currentCapacity * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}
