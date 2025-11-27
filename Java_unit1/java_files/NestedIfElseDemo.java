
class NestedIfElseDemo {
    public static void main(String[] args) {
        int num = -5;

        if (num >= 0) {
            if (num == 0)
                System.out.println("Number is Zero");
            else
                System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }
    }
}
