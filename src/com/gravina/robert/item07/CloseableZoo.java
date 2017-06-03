package com.gravina.robert.item07;

import com.gravina.robert.item06.Animal;
import com.gravina.robert.item06.Zoo;

public class CloseableZoo {
    private boolean closed = false;
    private Zoo zoo;

    public CloseableZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    void capture(Animal animal) {
        zoo.capture(animal);
    }

    void free() {
        zoo.free();
    }

    int getSize() {
        return zoo.getSize();
    }

    void close() {
        this.closed = true;
    }

    boolean isClosed() {
        return closed;
    }
}
