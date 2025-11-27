class Person {
    public String name = "Alice";
    private int age = 25;
    protected String city = "Bengaluru";
    String country = "India";

    public void showPublic() {
        System.out.println("Public Method: Name = " + name);
    }

    private void showPrivate() {
        System.out.println("Private Method: Age = " + age);
    }

    protected void showProtected() {
        System.out.println("Protected Method: City = " + city);
    }

    void showDefault() {
        System.out.println("Default Method: Country = " + country);
    }

    public void accessPrivateInsideClass() {
        System.out.println("Private Age accessed inside class: " + age);
        showPrivate();
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
        p.showPublic();
        p.accessPrivateInsideClass();
        System.out.println(p.city);
        p.showProtected();
        System.out.println(p.country);
        p.showDefault();
    }
}
