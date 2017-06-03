package com.gravina.robert.item01;

import java.util.HashMap;
import java.util.Map;

class Services {
    private static final Map<String, Provider> providers = new HashMap<>();
    private static final String DEFAULT_PROVIDER_NAME = "<def>";

    // 1. register providers
    static void registerProvider(String name, Provider provider) {
        providers.put(name, provider);
    }

    static void registerProvider(Provider provider) {
        providers.put(DEFAULT_PROVIDER_NAME, provider);

    }

    // 2. get service objects via providers
    static Service newInstance(String name) {
        return providers.get(name).newService();
    }

    static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }
}