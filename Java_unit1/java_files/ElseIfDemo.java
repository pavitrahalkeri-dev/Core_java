
class ElseIfDemo {
    public static void main(String[] args) {
        int temperature = 25;

        if (temperature > 35)
            System.out.println("It's too hot outside.");
        else if (temperature > 20)
            System.out.println("The weather is pleasant.");
        else
            System.out.println("It's quite cold.");
    }
}
