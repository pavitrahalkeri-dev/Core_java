interface Movable {
    void move();
}

interface Drivable extends Movable {
    void steer();
}

class Bike implements Drivable {
    public void move() {
        System.out.println("Bike is moving");
    }

    public void steer() {
        System.out.println("Bike is steering");
    }
}

public class BikeDemo {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.move();
        bike.steer();
    }
}
