package com.order;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class MethodAlphanumericTest {

    @Test
    void testZ() {
        checkIfEquals();
    }

    @Test
    void testA() {
        checkIfEquals();
    }

    @Test
    void testY() {
        checkIfEquals();
    }

    @Test
    void testE() {
        checkIfEquals();
    }

    @Test
    void testB() {
        checkIfEquals();
    }

    private static void checkIfEquals() {
        assertEquals(2, 1 + 1);
    }
}
