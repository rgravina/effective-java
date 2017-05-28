package com.gravina.robert.item01;

import java.util.HashMap;
import java.util.Map;

class Services {
    private static final Map<String, Provider> providers = new HashMap<>();
    private static final String DEFAULT_PROVIDER_NAME = "<def>";

    public static void registerProvider(String name, Provider provider) {
        providers.put(name, provider);
    }

    public static void registerProvider(Provider provider) {
        providers.put(DEFAULT_PROVIDER_NAME, provider);

    }

    public static Service newInstance(String name) {
        return providers.get(name).newService();
    }

    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }
}