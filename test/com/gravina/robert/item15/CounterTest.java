package com.gravina.robert.item15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    @Test
    void startsAtZero() {
        Counter counter = new Counter();
        assertEquals(0, counter.getCount());
    }

    @Test
    void countsUp() {
        Counter counter = new Counter().increment();
        assertEquals(1, counter.getCount());
    }

    @Test
    void countsDown() {
        Counter counter = new Counter(1).decrement();
        assertEquals(0, counter.getCount());
    }

    @Test
    void equalsWorksOnTwoInstances() {
        assertEquals(new Counter(), new Counter());
    }
}