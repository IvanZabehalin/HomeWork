package home.work.HW_module_8;

public class Main {
    public static void main(String[] args) {

        ShapePrint p = new ShapePrint();
        p.print(new Circle());
        p.print(new Oval());
        p.print(new Diamond());
        p.print(new Rhombus());
        p.print(new Trapezium());
        
    }
}
