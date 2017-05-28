package com.gravina.robert.item03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighlanderClassTest {
    @Test
    void thereCanBeOnlyOne() {
        assertSame(HighlanderClass.getInstance(), HighlanderClass.getInstance());
        assertSame(HighlanderClass.getInstance().howManyCanThereBe(), 1);
    }
}