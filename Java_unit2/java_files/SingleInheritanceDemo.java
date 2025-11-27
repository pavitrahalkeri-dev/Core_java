class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public void speak() {
        System.out.println(name + " makes a sound");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void speak() {
        System.out.println(name + " barks");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog("Rex");
        d.speak();
    }
}
