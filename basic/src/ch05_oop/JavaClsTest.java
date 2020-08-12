package ch05_oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaClsTest {

    @Test
    void testFact(){
        int got = JavaCls.unitTest();
        int want = 4;
        assertEquals(want, got);
    }

}