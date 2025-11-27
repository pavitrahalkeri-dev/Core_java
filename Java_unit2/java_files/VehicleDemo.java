interface Movable {
    void move();
}

interface Engine {
    void start();
}

class Vehicle implements Movable, Engine {
    public void move() {
        System.out.println("Vehicle moves");
    }

    public void start() {
        System.out.println("Engine starts");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.start();
        v.move();
    }
}
