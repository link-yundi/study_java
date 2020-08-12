package ch05_oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void test() {
        int got = Max.max(2, 9);
        int want = 9;
        assertEquals(want, got);
    }

}