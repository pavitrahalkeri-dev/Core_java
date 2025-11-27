interface Config {
    int MAX_CONNECTIONS = 10;
}

class Server implements Config {
    void showLimit() {
        System.out.println("Max Allowed: " + MAX_CONNECTIONS);
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println(Config.MAX_CONNECTIONS);
    }
}
