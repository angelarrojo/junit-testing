package com.order;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderTest {

    @Test
    void test0() {
        checkIfEquals();
    }

    @Test
    @Order(1)
    void test1() {
        checkIfEquals();
    }

    @Test
    @Order(3)
    void test2() {
        checkIfEquals();
    }

    @Test
    @Order(2)
    void test3() {
        checkIfEquals();
    }

    @Test
    void test4() {
        checkIfEquals();
    }

    private static void checkIfEquals() {
        assertEquals(2, 1 + 1);
    }
}