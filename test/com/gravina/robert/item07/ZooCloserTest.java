package com.gravina.robert.item07;

import com.gravina.robert.item06.Animal;
import com.gravina.robert.item06.Zoo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZooCloserTest {
    @Test
    void closesZooWhenAllAnimalsAreFree() {
        CloseableZoo zoo = new CloseableZoo(new Zoo());
        zoo.capture(new Animal("giraffe"));
        zoo.capture(new Animal("hippopotamus"));

        ZooCloser zooCloser = new ZooCloser(zoo);
        zooCloser.close();

        assertEquals(0, zoo.getSize());
        assertEquals(true, zoo.isClosed());
    }
}