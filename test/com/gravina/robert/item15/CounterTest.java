package com.gravina.robert.item15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    @Test
    void startsAtZero() {
        Counter counter = Counter.valueOf(0);
        assertEquals(0, counter.getCount());
    }

    @Test
    void countsUp() {
        Counter counter = Counter.valueOf(0).increment();
        assertEquals(1, counter.getCount());
    }

    @Test
    void countsDown() {
        Counter counter = Counter.valueOf(1).decrement();
        assertEquals(0, counter.getCount());
    }

    @Test
    void equalsWorksOnTwoInstances() {
        assertEquals(Counter.valueOf(0), Counter.valueOf(0));
    }
}