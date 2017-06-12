package com.gravina.robert.item26;

import java.util.EmptyStackException;

class GenericZoo<T> {
    private static final int MAX_ANIMALS = 4;
    private int size = 0;
    private T[] animals;

    @SuppressWarnings("unchecked")
    GenericZoo() {
        this.animals = (T[]) new Object[MAX_ANIMALS];
    }

    void capture(T animal) {
        if (size == MAX_ANIMALS) {
            throw new IllegalStateException();
        }
        this.animals[size++] = animal;
    }

    T free() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        T animal = this.animals[--size];
        this.animals[size] = null; // remove reference to animal no longer in zoo
        return animal;
    }

    int getSize() {
        return size;
    }
}
