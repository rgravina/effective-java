package com.gravina.robert.item07;

import com.gravina.robert.item06.Animal;
import com.gravina.robert.item06.Zoo;

public class CloseableZoo {
    private boolean closed = false;
    private Zoo zoo;

    public CloseableZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public void capture(Animal animal) {
        zoo.capture(animal);
    }

    public void free() {
        zoo.free();
    }

    public int getSize() {
        return zoo.getSize();
    }

    public void close() {
        this.closed = true;
    }

    public boolean isClosed() {
        return closed;
    }
}
