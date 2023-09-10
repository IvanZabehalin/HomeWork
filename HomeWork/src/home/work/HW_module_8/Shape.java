package home.work.HW_module_8;

public interface Shape {

    void shapeName();
    void shapePet();

}

class Oval implements Shape {

    @Override
    public void shapeName() {
        System.out.println("Shape name is - Oval");
    }

    @Override
    public void shapePet() {
        System.out.println("Dog");
    }
}

class Circle implements Shape {

    @Override
    public void shapeName() {
        System.out.println("Shape name is - Circle");
    }

    @Override
    public void shapePet() {

    }
}

class Trapezium implements Shape {

    @Override
    public void shapeName() {
        System.out.println("Shape name is - Trapezium");
    }

    @Override
    public void shapePet() {

    }
}

class Diamond implements Shape {

    @Override
    public void shapeName() {
        System.out.println("Shape name is - Diamond");
    }

    @Override
    public void shapePet() {

    }
}

class Rhombus implements Shape {

    @Override
    public void shapeName() {
        System.out.println("Shape name is - Rhombus");
    }

    @Override
    public void shapePet() {

    }
}
class ShapePrint{
    public void print(Shape shape){
        shape.shapeName();
        shape.shapePet();
    }
 }
