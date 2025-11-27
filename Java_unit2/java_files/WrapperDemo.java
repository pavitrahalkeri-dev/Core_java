public class WrapperDemo {
    public static void main(String[] args) {
        int a = 5;
        Integer obj = a;
        int b = obj;
        System.out.println("Integer object: " + obj);
        System.out.println("Primitive value: " + b);

        String number = "100";
        int parsed = Integer.parseInt(number);
        System.out.println("Parsed int: " + parsed);
    }
}
