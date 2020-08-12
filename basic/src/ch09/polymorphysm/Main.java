package ch09.polymorphysm;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat();
        a.barking();
        b.barking();
    }
}
