abstract class ShapeAbstract {
    abstract void draw();
    public void info() {
        System.out.println("A generic shape");
    }
}

class Triangle extends ShapeAbstract {
    void draw() {
        System.out.println("Drawing triangle");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        ShapeAbstract s = new Triangle();
        s.draw();
        s.info();
    }
}
