package com.gravina.robert.item01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicesTest {
    @Test
    void canRegisterProvider() {
        StandardProvider provider = new StandardProvider();
        Services.registerProvider("standard", provider);
        assertSame("standard service", Services.newInstance("standard").perform());
    }

    @Test
    void canRegisterDefaultProvider() {
        PremiumProvider premiumProvider = new PremiumProvider();
        StandardProvider standardProvider = new StandardProvider();
        Services.registerProvider(premiumProvider);
        Services.registerProvider("standard", standardProvider);
        assertSame("premium service", Services.newInstance().perform());
    }
}