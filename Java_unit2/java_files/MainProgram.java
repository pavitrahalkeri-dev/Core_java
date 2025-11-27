class Student {
    String name;
    int age;
    double marks;

    static String collegeName = "Christ University";

    Student() {
        name = "Unknown";
        age = 18;
        marks = 0.0;
    }

    Student(String s, int a, double m) {
        name = s;
        age = a;
        marks = m;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("College: " + collegeName);
        checkResult();
    }

    void checkResult() {
        if (marks >= 50)
            System.out.println("Status: Passed");
        else
            System.out.println("Status: Failed");
    }

    static void updateCollege(String newCollege) {
        collegeName = newCollege;
    }
}

public class MainProgram {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student("Kush", 22, 88.5);

        Student.updateCollege("School of Engineering and Technology");

        System.out.println("Student 1 Information:");
        st1.displayDetails();

        System.out.println();

        System.out.println("Student 2 Information:");
        st2.displayDetails();
    }
}
