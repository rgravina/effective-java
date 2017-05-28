package com.gravina.robert.item01;

public class StandardProvider implements Provider {
    @Override
    public Service newService() {
        return new StandardService();
    }
}
