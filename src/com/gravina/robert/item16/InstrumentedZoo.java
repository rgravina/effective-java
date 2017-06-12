package com.gravina.robert.item16;

import com.gravina.robert.item06.Animal;
import com.gravina.robert.item06.Zoo;

final class InstrumentedZoo {
    private int captures = 0;
    private int frees = 0;
    private final Zoo zoo;

    InstrumentedZoo() {
        zoo = new Zoo();
    }

    void capture(Animal animal) {
        captures++;
        zoo.capture(animal);
    }

    int getSize() {
        return zoo.getSize();
    }

    int getCaptures() {
        return captures;
    }

    void free() {
        frees++;
        zoo.free();
    }

    int getFrees() {
        return frees;
    }
}
