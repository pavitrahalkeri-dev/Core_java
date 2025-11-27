
class ScopeDemo {

    int instanceVar = 50; // instance variable
    static int staticVar = 100; // static variable

    public void display() {
        int localVar = 20; // local variable
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        ScopeDemo obj = new ScopeDemo();
        obj.display();
    }
}
