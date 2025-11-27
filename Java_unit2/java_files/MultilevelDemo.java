class Vehicle {
    public void start() {
        System.out.println("Vehicle starting");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car driving");
    }
}

class SportsCar extends Car {
    public void turboBoost() {
        System.out.println("Turbo boost engaged");
    }
}

public class MultilevelDemo {
    public static void main(String[] args) {
        SportsCar s = new SportsCar();
        s.start();
        s.drive();
        s.turboBoost();
    }
}
