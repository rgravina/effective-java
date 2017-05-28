package com.gravina.robert.item03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

class HighlanderEnumTest {
    @Test
    void thereCanBeOnlyOne() {
        assertNotNull(HighlanderEnum.INSTANCE);
        assertSame(HighlanderEnum.INSTANCE, HighlanderEnum.INSTANCE);
        assertSame(HighlanderEnum.INSTANCE.howManyCanThereBe(), 1);
    }
}