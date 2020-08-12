package ch12.typechange;

public class Main {
    public static void main(String[] args) {
        Computer c = new Computer() {
            @Override
            public void start() {
                System.out.println("Woooooo");
            }
        };
        c.start();
    }
}
