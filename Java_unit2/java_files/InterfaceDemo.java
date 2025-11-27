interface Movable {
    int speed = 50;
    void move();
}

class Car implements Movable {
    public void move() {
        System.out.println("Car is moving at speed " + speed);
    }
}

class Robot implements Movable {
    public void move() {
        System.out.println("Robot is walking at speed " + speed);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Movable m = new Car();
        m.move();
        m = new Robot();
        m.move();
    }
}
