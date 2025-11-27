interface Flyable {
    default void move() {
        System.out.println("Moving by flying");
    }
}

interface Swimmable {
    default void move() {
        System.out.println("Moving by swimming");
    }
}

class Duck implements Flyable, Swimmable {
    @Override
    public void move() {
        Flyable.super.move();
        Swimmable.super.move();
        System.out.println("Duck moves both ways");
    }
}

public class MultipleViaInterfaceDemo {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.move();
    }
}
