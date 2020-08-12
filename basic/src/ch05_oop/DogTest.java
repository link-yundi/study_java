package ch05_oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void test() {
        Dog dog = new Dog();
        String got = dog.barking();
        String want = "Woof-Woof";
        assertEquals(want, got);
    }
}