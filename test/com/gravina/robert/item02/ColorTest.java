package com.gravina.robert.item02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorTest {
    @Test
    void defaultsToBlack() {
        Color color = new Color.Builder().build();
        assertSame(color.toHex(), "000000");
    }

    @Test
    void canBeBuiltAndReturnBlack() {
        Color color = new Color.Builder().red(0).green(0).blue(0).build();
        assertSame(color.toHex(), "000000");
    }
}
