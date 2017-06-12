package com.gravina.robert.item26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericZooTest {
    @Test
    void addsAndIncrementsSize() {
        GenericZoo<Plant> zoo = new GenericZoo<>();
        zoo.capture(new Plant("basil"));
        zoo.capture(new Plant("parsley"));
        // zoo.capture(new Animal("giraffe"));  // can only add plants to this zoo
        assertEquals(2, zoo.getSize());

    }

    @Test
    void removesAndDecrementsSize() {
        GenericZoo<Plant> zoo = new GenericZoo<>();
        Plant herb = new Plant("basil");
        zoo.capture(herb);
        assertEquals(herb, zoo.free());
        assertEquals(0, zoo.getSize());
    }
}