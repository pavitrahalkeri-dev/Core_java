public class StringDemoExample {
    public static void main(String[] args) {
        String s = "Hello";
        s = s + " World";
        System.out.println(s);

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println(sbf);

        StringBuilder sbd = new StringBuilder("Hello");
        sbd.append(" World");
        System.out.println(sbd);
    }
}
