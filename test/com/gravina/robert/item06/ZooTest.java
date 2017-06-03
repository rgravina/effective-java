package com.gravina.robert.item06;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ZooTest {
    @Test
    void addsAndIncrementsSize() {
        Zoo zoo = new Zoo();
        zoo.capture(new Animal("giraffe"));
        zoo.capture(new Animal("hippopotamus"));
        assertEquals(2, zoo.getSize());
    }

    @Test
    void removesAndDecrementsSize() {
        Zoo zoo = new Zoo();
        Animal giraffe = new Animal("giraffe");
        zoo.capture(giraffe);
        assertEquals(giraffe, zoo.free());
        assertEquals(0, zoo.getSize());
    }

    @Test
    void throwsExceptionWhenAddingToFullZoo() {
        Zoo zoo = new Zoo();
        Animal giraffe = new Animal("giraffe");
        Animal[] animals = {giraffe, giraffe, giraffe, giraffe,
                giraffe, giraffe, giraffe, giraffe,
                giraffe, giraffe, giraffe, giraffe,
                giraffe, giraffe, giraffe, giraffe};
        for (Animal animal : animals) {
            zoo.capture(animal);
        }
        assertThrows(IllegalStateException.class, () -> zoo.capture(giraffe));
    }

    @Test
    void throwsExceptionWhenRemoveOnAnEmptyZoo() {
        Zoo zoo = new Zoo();
        assertThrows(EmptyStackException.class, zoo::free);
    }
}