package com.order;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class MethodAlphanumericTest {

    @Test
    void testZ() {
        assertThat(2, equalTo(2));
    }

    @Test
    void testA() {
        assertThat(2, equalTo(2));
    }

    @Test
    void testY() {
        assertThat(2, equalTo(2));
    }

    @Test
    void testE() {
        assertThat(2, equalTo(2));
    }

    @Test
    void testB() {
        assertThat(2, equalTo(2));
    }
}
