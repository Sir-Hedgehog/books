package com.cosmina.ch3.cdl;

public class DefaultContainer implements Container {

    @Override
    public Object getDependency(String key) {
        if ("myDependency".equals(key)) {
            return new Dependency();
        }
        throw new RuntimeException("Unknown dependency: " + key);
    }
}
