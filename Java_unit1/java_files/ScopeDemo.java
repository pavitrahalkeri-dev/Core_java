
class ScopeDemo {

    int instanceVar = 50;          
    static int staticVar = 100;    

    public void display() {
        int localVar = 20;         
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        ScopeDemo obj = new ScopeDemo();
        obj.display();
    }
}
