package com.gravina.robert.item07;

import com.gravina.robert.item06.Zoo;

import java.util.EmptyStackException;

public class ZooCloser {
    private CloseableZoo zoo;

    public ZooCloser(CloseableZoo zoo) {
        this.zoo = zoo;
    }

    void close() {
        try {
            while (true) {
                zoo.free();
            }
        } catch (EmptyStackException e) {
        } finally {
            zoo.close();
        }
    }
}
