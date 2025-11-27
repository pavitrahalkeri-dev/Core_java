public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 == s3 : " + (s1 == s3));
        System.out.println("s1.equals(s3) : " + s1.equals(s3));

        String original = "Java";
        String modified = original.concat(" Programming");
        System.out.println("Original: " + original);
        System.out.println("Modified: " + modified);

        String name = "Christ University";
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Substring(0, 6): " + name.substring(0, 6));
        System.out.println("Contains 'Uni': " + name.contains("Uni"));
        System.out.println("Starts with 'Chr': " + name.startsWith("Chr"));
        System.out.println("Ends with 'ty': " + name.endsWith("ty"));
        System.out.println("Index of 'U': " + name.indexOf('U'));
        System.out.println("Replace: " + name.replace("University", "Dept of AI & ML"));

        String a = "Kush";
        String b = "kush";
        System.out.println("equals(): " + a.equals(b));
        System.out.println("equalsIgnoreCase(): " + a.equalsIgnoreCase(b));
        System.out.println("compareTo(): " + a.compareTo(b));

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Students");
        System.out.println("StringBuilder result: " + sb);

        StringBuffer sf = new StringBuffer("Welcome");
        sf.append(" All");
        System.out.println("StringBuffer result: " + sf);

        String test = "Java";
        test = test.concat(" is powerful");
        System.out.println("Immutable concatenation result: " + test);

        StringBuilder efficient = new StringBuilder("Java");
        efficient.append(" is powerful").append(" and fast");
        System.out.println("Efficient result: " + efficient);

        System.out.println("StringBuilder: Not thread-safe but faster");
        System.out.println("StringBuffer: Thread-safe but slower");
    }
}
