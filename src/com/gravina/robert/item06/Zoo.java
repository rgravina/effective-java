package com.gravina.robert.item06;

import java.util.EmptyStackException;

public class Zoo {
    private static final int MAX_ANIMALS = 4;
    private int size = 0;
    private Animal[] animals;

    public Zoo() {
        this.animals = new Animal[MAX_ANIMALS];
    }

    public void capture(Animal animal) {
        if (size == MAX_ANIMALS) {
            throw new IllegalStateException();
        }
        this.animals[size++] = animal;
    }

    public Animal free() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Animal animal = this.animals[--size];
        this.animals[size] = null; // remove reference to animal no longer in zoo
        return animal;
    }

    public int getSize() {
        return size;
    }
}
