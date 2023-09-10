package home.work.HW_module_9.myArrayList;


import home.work.HW_module_9.myLinkedList.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> name = new MyArrayList<String>();
        name.add("anton");
        name.add("roman");


        System.out.println(name.size());
        System.out.println(name);
        name.remove(0);
        name.remove(1);
        System.out.println(name.size());
        System.out.println(name);
        // System.out.println(name.get(0));
        name.add("Silvia");
        System.out.println(name.size());
        System.out.println(name);
    }
}
