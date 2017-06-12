package com.gravina.robert.item16;

import com.gravina.robert.item06.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstrumentedZooTest {
    @Test
    void countsOperations() {
        InstrumentedZoo zoo = new InstrumentedZoo();

        zoo.capture(new Animal("giraffe"));
        zoo.capture(new Animal("hippopotamus"));
        assertEquals(2, zoo.getSize());
        assertEquals(2, zoo.getCaptures());
        assertEquals(0, zoo.getFrees());

        zoo.free();
        assertEquals(1, zoo.getSize());
        assertEquals(2, zoo.getCaptures());
        assertEquals(1, zoo.getFrees());
    }
}