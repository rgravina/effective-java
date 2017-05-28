package com.gravina.robert.item01;

public class PremiumProvider implements Provider {
    @Override
    public Service newService() {
        return new PremiumService();
    }
}
