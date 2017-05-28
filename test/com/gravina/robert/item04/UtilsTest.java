package com.gravina.robert.item04;

import org.junit.jupiter.api.Test;

import javax.rmi.CORBA.Util;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    @Test
    void adder() {
        // can not do this
        // new Utils();
        assertSame(3, Utils.adder(1, 2));
    }
}