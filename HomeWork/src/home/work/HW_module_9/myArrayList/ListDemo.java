package home.work.HW_module_9.myArrayList;

public interface ListDemo<E> {
    void add(E element);
    boolean remove(int index);
    void clear();
    int size();
    Object get(int index);
}
