package com.gravina.robert.item05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTest {
    @Test
    void beforeY2K() {
        assertTrue((new Year(1970)).beforeY2K());
    }
}