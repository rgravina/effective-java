package com.gravina.robert.item02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorTest {
    @Test
    void defaultsToBlack() {
        Color color = new Color.Builder().build();
        assertEquals("000000", color.toHex());
    }

    @Test
    void canBeBuiltAndReturnColorInHex() {
        Color color = new Color.Builder()
                .red(231)
                .green(255)
                .blue(37)
                .build();
        assertEquals("e7ff25", color.toHex());
    }
}
