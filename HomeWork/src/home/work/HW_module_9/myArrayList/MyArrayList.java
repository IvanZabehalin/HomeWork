package home.work.HW_module_9.myArrayList;


import java.util.Arrays;

public class MyArrayList<E> implements ListDemo<E> {

    private Object[] elementData;
    private int size;

    public MyArrayList() {
        elementData = new Object[1];
        size = 0;
    }

    @Override
    public void add(E element) {
        if (size >= elementData.length) {
            elementData = Arrays.copyOf(elementData, elementData.length + 1);
        }
        elementData[size] = element;
        size++;
    }

    @Override
    public boolean remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        elementData = Arrays.copyOf(elementData, elementData.length - 1);
        size--;
        return true;
    }


    @Override
    public void clear() {
        elementData = new Object[1];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        return (E) elementData[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(elementData);
    }
}